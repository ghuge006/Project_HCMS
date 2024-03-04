package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.LeaveApprovals;

public interface LeaveApprovalsDAO {
	List<LeaveApprovals> getAllLeaveApprovals();

	void addLeaveApprovals(LeaveApprovals leaveApprovals);

	void updateLeaveApprovals(LeaveApprovals leaveApprovals);

	void deleteLeaveApprovals(int approvalId);
	
	LeaveApprovals getLeaveApprovalsById(int approvalId);
}
