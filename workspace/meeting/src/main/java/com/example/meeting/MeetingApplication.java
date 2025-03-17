package com.example.meeting;

import com.example.meeting.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class MeetingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetingApplication.class, args);
	}

//	@Autowired
//	UserService userService;
//
//	@Override
//	public void run(String... args) throws Exception {
//		//String message = userService.register("abc@abc.com","1234");
////		log.info();
//	}
	@Bean
	public CommandLineRunner run(UserService userService){
		return args -> {
//			String message = userService.register("abc44@abc.com","1234");
//			log.info("::::::::::::::::::::   "+message);
		};
	}
}
