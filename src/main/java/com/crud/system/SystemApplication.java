package com.crud.system;

import com.crud.system.entity.Student;
import com.crud.system.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(SystemApplication.class, args);
	}

CommandLineRunner commandLineRunner (final StudentRepository studentRepository){
		return args->{
			Student maria = new Student(
					"Maria",
					"Rosa",
					"maria.rosa@gmail.com",
					22
			);
			studentRepository.save(maria);
		};
}

}
