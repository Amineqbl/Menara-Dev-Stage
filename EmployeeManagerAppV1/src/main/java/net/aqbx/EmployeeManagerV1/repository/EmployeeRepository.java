package net.aqbx.EmployeeManagerV1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.aqbx.EmployeeManagerV1.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
