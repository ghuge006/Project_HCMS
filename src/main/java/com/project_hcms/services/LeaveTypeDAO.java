package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.LeaveTypes;

public interface LeaveTypeDAO {
	List<LeaveTypes> getAllLeaveType();

	void addLeaveType(LeaveTypes leaveType);

	void updateLeaveType(LeaveTypes leaveType);

	void deleteLeaveType(int leaveTypeId);
	
	LeaveTypes getLeaveTypeById(int leaveTypeId);
}
