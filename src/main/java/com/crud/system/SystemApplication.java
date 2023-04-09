package com.crud.system;

import com.crud.system.repository.StudentIdCardRepository;
import com.crud.system.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(SystemApplication.class, args);
	}



}
