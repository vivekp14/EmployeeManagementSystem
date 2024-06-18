package com.employeemanagementservice.spring_backend;

import com.employeemanagementservice.spring_backend.model.Employee;
import com.employeemanagementservice.spring_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBackendApplication.class, args);

	}
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Vivek");
//		employee.setLastName("Yadav");
//		employee.setEmailId("vivek@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Suresh");
//		employee1.setLastName("Bairaghi");
//		employee1.setEmailId("suresh@gmail.com");
//		employeeRepository.save(employee1);
	}
}
