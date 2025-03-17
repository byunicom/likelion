package com.example.springdatajpa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@Slf4j
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		System.out.println("--------start------------");
		SpringApplication.run(SpringdatajpaApplication.class, args);
		System.out.println("---------end-----------");
	}

	@Bean
	public CommandLineRunner run(UserRepository repository){
		return args -> {
			//create
//			User user = new User("hong","hong@example.com");
//			repository.save(user);
//			log.info("사용자 추가 : "+user);
			//read
//			repository.findAll().forEach(user3 -> log.info(user3.toString()));
//			System.out.println("================================");
			List<User> caramis = repository.findByName("carami");
			caramis.forEach(user -> user.toString());

			log.info("======select : "+ caramis);
//
//			List<User> caramis1 = repository.findByEmail("carami@example.com");
//			caramis1.forEach(user -> user.toString());

			//update
//			User user2 = repository.findById(1L).get();
//			user2.setName("강경미");
//			user2.setEmail("carami@nate.com");
//			repository.save(user2);
//			log.info("###########updated : "+user2.toString());

			//delete
//			User user1 = repository.findById(12L).get();
//			repository.delete(user1);
		};
	}
}
