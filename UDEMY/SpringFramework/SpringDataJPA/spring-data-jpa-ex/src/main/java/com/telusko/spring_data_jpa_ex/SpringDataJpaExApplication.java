package com.telusko.spring_data_jpa_ex;

import com.telusko.spring_data_jpa_ex.model.Student;
import com.telusko.spring_data_jpa_ex.repository.studentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		studentRepo repo = context.getBean(studentRepo.class);

//		s1.setRollNo(101);
//		s1.setName("Bhargav");
//		s1.setMarks(95);
//
//		s2.setRollNo(102);
//		s2.setName("Mani");
//		s2.setMarks(80);
//
//		s3.setRollNo(103);
//		s3.setName("sagar");
//		s3.setMarks(75);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

//		optional is the class which can handle null objects,null values.
//		Optional<Student> s = repo.findById(102);
//		System.out.println(repo.findById(103));

		System.out.println(repo.findByName("Bhargav"));

		System.out.println(repo.findByMarks(80));

		System.out.println(repo.findByMarksGreaterThan(75));

//		Update Query
		s3.setRollNo(103);
		s3.setName("sagar");
		s3.setMarks(78);

		repo.save(s3);

//		Delete Query
		repo.delete(s2);

	}

}
