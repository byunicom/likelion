package com.example.springdatajpa2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.support.TransactionTemplate;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        log.info("---------start---------");
        System.out.println(LocalDate.of(2002, 2, 20));
        //SpringApplication.run(Application.class, args);
        log.info("---------end---------");
    }

    @Bean
    public CommandLineRunner run(TransactionTemplate transactionTemplate, CustomerRepository repository, CustomerService service){
        return args -> {

            log.info("---------이름으로 조회하고 싶다.--------------");
            //이름으로 조회하고 싶다.
            List<Customer> customer1 = repository.findByName("최지현");
            customer1.forEach(customer -> log.info("이름으로 조회 :: {}, {} ", customer.getName(), customer.getEmail()));

            log.info("---------이메일로 조회.--------------");
            repository.findByEmail("kim@example.com").forEach(customer -> log.info("이메일로 조회 :: {}, {} ", customer.getName(), customer.getEmail()));

//            @Query("SELECT c, count(o) FROM Customer c LEFT JOIN c.orders o GROUP BY c")

            //각 고객과 고객의 주문수를 알고 싶어요
            log.info("각 고객과 고객의 주문수를 알고 싶어요.");
            List<Object[]> customerOrderCounts = repository.findCustomerOrderCount();
            log.info("결과 ::: "+customerOrderCounts.size());
            customerOrderCounts.forEach(result->{
                Customer customer = (Customer) result[0];
                Long count = (Long) result[1];
                log.info("고객::: "+ customer.getName()+", 주문수 :: "+ count);
            });

            //고객의 세부 정보와 그 고객의 가장 퇴근 주문 조회를 알고 싶어요.
            log.info("고객의 세부 정보와 그 고객의 가장 퇴근 주문 조회를 알고 싶어요.");
            List<Object[]> latestOrders = repository.findCustomersWithLatestOrder();
            latestOrders.forEach(result->{
                Customer customer = (Customer) result[0];
                Order order = (Order) result[1];
                log.info("고객 ::: {}, 최근 주문 :: {}", customer.getName(), order.getProduct());
            });

            //평균나이보다 많은 고객을 조회하고 싶어요.
            log.info("평균나이보다 많은 고객을 조회하고 싶어요.");
            repository.findCustomerOlderThanAverage().forEach(customer -> log.info("평균나이 이상의 고객:::"+customer.getName()));

            Pageable pageable = PageRequest.of(0,5);
            repository.findByEmailContaining("exam",pageable).forEach(customer->log.info("페이징 처리된 customer::{},{}",customer.getName(),customer.getEmail()));

            log.info("-----SP 호출-----");
            List<Customer> customerSp = repository.findByNameSP("수");
            customerSp.forEach(customer -> log.info("SP를 이용해 이름으로 조회 :: {}, {} ", customer.getName(), customer.getEmail()));

        };

    }
}
