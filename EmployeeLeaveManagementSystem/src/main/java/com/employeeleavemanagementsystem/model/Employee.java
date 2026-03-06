package com.employeeleavemanagementsystem.model;

import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employeeId;
	
	private String name;
	private String email;
	private String department;
	private LocalDate joiningDate;
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<LeaveRequest> LeaveRequest;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	
	public void setLeaveRequest(List<LeaveRequest> LeaveRequest) {
		this.LeaveRequest = LeaveRequest;
	}
	
	public List<LeaveRequest> getLeaveRequest() {
		return LeaveRequest;
	}
}
