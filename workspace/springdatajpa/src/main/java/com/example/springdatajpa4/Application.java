package com.example.springdatajpa4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;
import java.util.Arrays;

@SpringBootApplication
@Slf4j
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Bean
    public CommandLineRunner demo(EmployeeRepository employeeRepository){
        return(args -> {
//            //Custom query examples
//            log.info("Employees with last name 'Ernst':");
//            employeeRepository.findByLastName("Ernst").forEach(
////                    employee -> log.info("ID:" + employee.getId()+ ", firstName :" +employee.getFirstName())
//                    employee -> log.info("====toString()====== : "+employee.toString())
//            );
//
//            log.info("Employees with salary greater than or equal to 10000:");
//            employeeRepository.findBySalaryGreaterThanEqual(10000.0).forEach(
//                    employee -> log.info
//                            (
//                                "ID:" + employee.getId()
//                                + ", firstName :" +employee.getFirstName()
//                                + ", lastName :" + employee.getLastName()
//                                + ", email :" + employee.getEmail()
//                                + ", salary :"+ employee.getSalary()
//                            )
//            );
//
//            log.info("Employee with employee ID 100:");
//            employeeRepository.findById(100).ifPresent(
//                    employee -> log.info("ID:" + employee.getId()+ ", firstName :" +employee.getFirstName())
//            );
//
//            log.info("Employee with salary less than 4000.0 or greater than 20000.0:");
//            employeeRepository.findBySalaryLessThanOrSalaryGreaterThan(4000.0,20000.0).forEach(
//                    employee -> log.info("ID:" + employee.getId()+ ", firstName :" +employee.getFirstName()+ ", salary :"+ employee.getSalary())
//            );
//
//            log.info("Employees hired between 2000-01-01 and 2000-12-31:");
//            employeeRepository.findByHireDateBetween(
//                    Date.valueOf("2000-01-01"),Date.valueOf("2000-12-31")).forEach(
//                            employee -> log.info(
//                                    "ID:" + employee.getId()+
//                                            ", firstName :" +employee.getFirstName()+
//                                            ", salary :"+ employee.getSalary()+
//                                            ", hire_date:"+employee.getHireDate()
//                            )
//            );
//
//            log.info("----------------------------------------Employees in departments 10 and 20:");
//            employeeRepository.findByDepartmentIdIn(Arrays.asList(10, 20)).forEach(
//                    employee -> log.info("Employee First Name: "+employee.getFirstName()+", Department Name:"+employee.getDepartment().getName())
//            );
//
//            log.info("----------------------------------------Employees in department 1 with salary between 2900 and 3100:");
//            employeeRepository.findByDepartmentIdInAndSalaryBetween(Arrays.asList(30), 2900.0, 3100.0).forEach(
//                    employee -> log.info(employee.toString())
//            );
//
//            log.info("----------------------------------------Employees with no manager:");
//            employeeRepository.findByManagerIdIsNull().forEach(
//                    employee -> log.info(employee.toString())
//            );
//
//            log.info("----------------------------------------Employees with a manager:");
//            employeeRepository.findByManagerIdIsNotNull().forEach(
//                    employee -> log.info(employee.toString())
//            );
//
//            log.info("----------------------------------------Employees with commission percentage not null, ordered by salary desc and commission percentage desc:");
//            employeeRepository.findByCommissionPctNotNullOrderBySalaryDescCommissionPctDesc().forEach(
//                    employee -> log.info(employee.toString())
//            );
//
//            log.info("----------------------------------------Employees with last name starting with 'Do':");
//            employeeRepository.findByLastNameStartingWith("Do").forEach(
//                    employee -> log.info(employee.toString())
//            );
//
//            employeeRepository.findByFirstNameContaining("D").forEach(employee -> log.info("라이크문 테스트:"+employee.getFirstName()));
//
            log.info("Employees in department 1 with salary between 2900 and 3100: Fetch Join------------");
            employeeRepository.findByDepartmentIdInAndSalaryBetween(Arrays.asList(30), 2900.0, 3100.0).forEach(
                    employee -> log.info(employee.toString())
            );
//            log.info("---------country id------------");
//            employeeRepository.findByName("Argentina").forEach(country -> log.info(country.getName()));


        });
    }
}
