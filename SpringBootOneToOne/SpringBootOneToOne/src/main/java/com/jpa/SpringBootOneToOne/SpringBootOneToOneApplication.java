package com.jpa.SpringBootOneToOne;

import com.jpa.SpringBootOneToOne.entity.AadharCard;
import com.jpa.SpringBootOneToOne.entity.Student;
import com.jpa.SpringBootOneToOne.repository.AadharCardJpaRepository;
import com.jpa.SpringBootOneToOne.repository.StudentJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootOneToOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("-------------STARTING OF SPRING APP-------------");
		SpringApplication.run(SpringBootOneToOneApplication.class, args);
		System.out.println("-------------ENDING OF SPRING APP ---------------");
	}

	@Autowired
	private StudentJpaRepository studentJpaRepository;

	@Autowired
	private AadharCardJpaRepository aadharCardJpaRepository;

	@Override
	public void run(String... args) throws Exception {
		AadharCard aadharCard = new AadharCard();
		aadharCard.setNumber("345676");
		aadharCardJpaRepository.save(aadharCard);

		Student student = new Student();
		student.setFirstName("aditya");
		student.setLastName("shinde");
		student.setAadharCard(aadharCard);
		studentJpaRepository.save(student);

		Student student1 = studentJpaRepository.findById(1L).get();

		System.out.println("Student Details : " + student1);
		System.out.println("Aadhar Card Details : " + student1.getAadharCard());

//		AadharCard aadharCard1 = aadharCardJpaRepository.findById(1L).get();
//		System.out.println("Aadhar Card Info : " + aadharCard1.getStudent());

	}
}
