package com.ss.studentmanagementsystem;

import com.ss.studentmanagementsystem.entity.Student;
import com.ss.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student sdt1 = new Student(1000L,"James","Mayer","jm@gmail.com");
		studentRepository.save(sdt1);

		Student sdt2 = new Student(1001L,"Tim","Hod","th@gmail.com");
		studentRepository.save(sdt2);

		Student sdt3 = new Student(1002L,"Lilly","Smith","ls@gmail.com");
		studentRepository.save(sdt3);
	}
}
