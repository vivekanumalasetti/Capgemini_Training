package com.employeeleavemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employeeleavemanagementsystem.model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {
}
