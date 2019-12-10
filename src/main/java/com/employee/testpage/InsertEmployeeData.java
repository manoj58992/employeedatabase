package com.employee.testpage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.entities.EmployeeEntity;
import com.employee.repositories.EmployeeRepository;

public class InsertEmployeeData {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("employee-context.xml");
		EmployeeRepository employeeRipository = (EmployeeRepository) ctx.getBean("employeeRipository");

		EmployeeEntity e = new EmployeeEntity();
		e.setFname("Donald");
		e.setLname("Trump");
		e.setPhnum(5269289282L);
		e.setEmail("donald536@gmail.com");
		e.setGender("Male");

		EmployeeEntity e1 = new EmployeeEntity();
		e1.setFname("Beyonce");
		e1.setLname("Morris");
		e1.setPhnum(9202289282L);
		e1.setEmail("beyonce996@gmail.com");
		e1.setGender("Female");

		EmployeeEntity e2 = new EmployeeEntity();
		e2.setFname("Jack");
		e2.setLname("Nelson");
		e2.setPhnum(7282929282L);
		e2.setEmail("jack536@gmail.com");
		e2.setGender("Male");

		EmployeeEntity e3 = new EmployeeEntity();
		e3.setFname("Shivangi");
		e3.setLname("Dutta");
		e3.setPhnum(6327289282L);
		e3.setEmail("shivangi@gmail.com");
		e3.setGender("Female");

		employeeRipository.save(e);
		employeeRipository.save(e1);
		employeeRipository.save(e2);
		employeeRipository.save(e3);

	}

}
