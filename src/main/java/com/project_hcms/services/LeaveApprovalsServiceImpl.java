package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.LeaveApprovalsDAO;
import com.project_hcms.entities.LeaveApprovals;
@Service
public class LeaveApprovalsServiceImpl implements LeaveApprovalsService{
	@Autowired
	LeaveApprovalsDAO leaveApprovalsDAO;
	@Override
	public List<LeaveApprovals> getAllLeaveApprovals() {
		// TODO Auto-generated method stub
		return leaveApprovalsDAO.getAllLeaveApprovals();
	}

	@Override
	public void addLeaveApprovals(LeaveApprovals leaveApprovals) {
		// TODO Auto-generated method stub
		leaveApprovalsDAO.addLeaveApprovals(leaveApprovals);
	}

	@Override
	public void updateLeaveApprovals(LeaveApprovals leaveApprovals) {
		// TODO Auto-generated method stub
		leaveApprovalsDAO.updateLeaveApprovals(leaveApprovals);
	}

	@Override
	public void deleteLeaveApprovals(LeaveApprovals leaveApprovals) {
		// TODO Auto-generated method stub
		leaveApprovalsDAO.deleteLeaveApprovals(leaveApprovals);
	}

	@Override
	public LeaveApprovals getLeaveApprovalsById(int approvalId) {
		// TODO Auto-generated method stub
		return leaveApprovalsDAO.getLeaveApprovalsById(approvalId);
	}

}
