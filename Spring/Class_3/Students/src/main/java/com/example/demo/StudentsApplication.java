package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Grade;
import com.example.demo.model.Student;
import com.example.demo.repository.GradeRepository;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentsApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext configurableApplicationContext = 
				SpringApplication.run(StudentsApplication.class, args);
		
		GradeRepository gradeRepo = configurableApplicationContext.getBean(GradeRepository.class);
		StudentRepository studentRepo = configurableApplicationContext.getBean(StudentRepository.class);

		Grade grade1 = new Grade(1, "A2");
		gradeRepo.save(grade1);

		Grade grade2 = new Grade(2, "B5");
		gradeRepo.save(grade2);

		Student student1 = new Student(1, "Eli Cohen", 90, grade1);
		studentRepo.save(student1);
		
		Student student2 = new Student(2, "Dana Levy", 75, grade1);
		studentRepo.save(student2);

		Student student3 = new Student(3, "Avi Shir", 60, grade2);
		studentRepo.save(student3);

		Student student4 = new Student(4, "Limor Geva", 55, grade1);
		studentRepo.save(student4);
		
		System.out.println("---------------------------get all students-----------------------------");
		List<Student> students = studentRepo.findAll();
		students.forEach(student -> System.out.println(student.toString()));
		
		System.out.println("---------------------------get all grades-----------------------------");
		List<Grade> grades = gradeRepo.findAll();
		grades.forEach(grade -> System.out.println(grade.toString()));

		System.out.println("---------------------------get all students in grade1-----------------------------");		
		students.forEach(student -> {
			if(student.getGrade().getId() == grade1.getId()) {
				System.out.println(student.toString());
			}
		});

		System.out.println("---------------------------get all students in grade2-----------------------------");		
		students.forEach(student -> {
			if(student.getGrade().getId() == grade2.getId()) {
				System.out.println(student.toString());
			}
		});
		
		System.out.println("---------------------------get all students average above 85-----------------------------");		
		students.forEach(student -> {
			if(student.getAverage() > 85) {
				System.out.println(student.toString());
			}
		});

		System.out.println("---------------------------get all students average below 60-----------------------------");		
		students.forEach(student -> {
			if(student.getAverage() < 60) {
				System.out.println(student.toString());
			}
		});
		
	}

}
