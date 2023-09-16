package net.aqbx.EmployeeManagerV1.service;

import java.util.List;

import net.aqbx.EmployeeManagerV1.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);
}
