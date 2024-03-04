package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.LeaveRequests;

public interface LeaveRequestsDAO {
	List<LeaveRequests> getAllLeaveRequests();

	void addLeaveRequests(LeaveRequests leaveRequests);

	void updateLeaveRequests(LeaveRequests leaveRequests);

	void deleteLeaveRequests(int leaveRequestId);
	
	LeaveRequests getLeaveRequestsById(int leaveRequestId);
}
