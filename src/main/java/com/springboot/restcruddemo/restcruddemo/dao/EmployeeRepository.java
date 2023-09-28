package com.springboot.restcruddemo.restcruddemo.dao;

import com.springboot.restcruddemo.restcruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}