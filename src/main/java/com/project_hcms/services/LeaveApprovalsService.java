package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.LeaveApprovals;

public interface LeaveApprovalsService {
	List<LeaveApprovals> getAllLeaveApprovals();

	void addLeaveApprovals(LeaveApprovals leaveApprovals);

	void updateLeaveApprovals(LeaveApprovals leaveApprovals);

	void deleteLeaveApprovals(LeaveApprovals leaveApprovals);
	
	LeaveApprovals getLeaveApprovalsById(int approvalId);
}
