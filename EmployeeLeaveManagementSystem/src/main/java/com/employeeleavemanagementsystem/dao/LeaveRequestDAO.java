package com.employeeleavemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employeeleavemanagementsystem.model.LeaveRequest;
import java.util.List;

public interface LeaveRequestDAO extends JpaRepository<LeaveRequest, Long> {

    List<LeaveRequest> findByEmployeeEmployeeId(Long employeeId);
}