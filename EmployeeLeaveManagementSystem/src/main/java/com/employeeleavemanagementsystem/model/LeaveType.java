package com.employeeleavemanagementsystem.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class LeaveType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long leaveTypeId;

    private String leaveName;
    private int maxDaysAllowed;

    @OneToMany(mappedBy = "leaveType")
    private List<LeaveRequest> leaveRequests;

    // -------------------------
    // Getters and Setters
    // -------------------------

    public Long getLeaveTypeId() {
        return leaveTypeId;
    }

    public void setLeaveTypeId(Long leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public int getMaxDaysAllowed() {
        return maxDaysAllowed;
    }

    public void setMaxDaysAllowed(int maxDaysAllowed) {
        this.maxDaysAllowed = maxDaysAllowed;
    }

    public List<LeaveRequest> getLeaveRequests() {
        return leaveRequests;
    }

    public void setLeaveRequests(List<LeaveRequest> leaveRequests) {
        this.leaveRequests = leaveRequests;
    }
}