package com.employeeleavemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employeeleavemanagementsystem.model.LeaveType;

public interface LeaveTypeDAO extends JpaRepository<LeaveType, Long> {
}