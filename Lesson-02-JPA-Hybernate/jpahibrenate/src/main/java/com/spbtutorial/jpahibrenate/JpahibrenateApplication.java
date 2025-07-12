package com.spbtutorial.jpahibrenate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spbtutorial.jpahibrenate.dao.StudentDOA;
import com.spbtutorial.jpahibrenate.dao.StudentDoaImpl;
import com.spbtutorial.jpahibrenate.entity.Student;

@SpringBootApplication
public class JpahibrenateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpahibrenateApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDOA studentDOA) {
		return runner -> {
			// Example usage of StudentDoaImpl
			Student student = new Student();
			student.setName("John Doe2");
			student.setEmail("sme@somee1.com");
			studentDOA.saveStudent(student);
			System.out.println("Student saved: " + student);
			Student retrievedStudent = studentDOA.getStudentById(student.getId());
			System.out.println("Retrieved Student: " + retrievedStudent);

		};
	}

}
