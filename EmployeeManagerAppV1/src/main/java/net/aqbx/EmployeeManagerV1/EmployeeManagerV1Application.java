package net.aqbx.EmployeeManagerV1;

import net.aqbx.EmployeeManagerV1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagerV1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerV1Application.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		

		
	}

}
