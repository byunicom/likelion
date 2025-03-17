package com.example.mssql;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class MssqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(MssqlApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(MssqlRepository mssqlRepository){
		return args -> {
				mssqlRepository.findByItemCd("0168ASY37A0_RM").forEach(mssql -> log.info(mssql.toString()));
		};
	}

}
