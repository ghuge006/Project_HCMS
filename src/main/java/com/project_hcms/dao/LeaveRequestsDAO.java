package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.LeaveRequests;

public interface LeaveRequestsDAO {
	List<LeaveRequests> getAllLeaveRequests();

	void addLeaveRequests(LeaveRequests leaveRequests);

	void updateLeaveRequests(LeaveRequests leaveRequests);

	void deleteLeaveRequests(LeaveRequests leaveRequests);
	
	LeaveRequests getLeaveRequestsById(int leaveRequestId);
}
