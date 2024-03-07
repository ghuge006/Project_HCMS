package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.LeaveRequestsDAO;
import com.project_hcms.entities.LeaveRequests;
@Service
public class LeaveRequestsServiceImpl implements LeaveRequestsService{
	@Autowired
	LeaveRequestsDAO leaveRequestsDAO;
	@Override
	public List<LeaveRequests> getAllLeaveRequests() {
		// TODO Auto-generated method stub
		return leaveRequestsDAO.getAllLeaveRequests();
	}

	@Override
	public void addLeaveRequests(LeaveRequests leaveRequests) {
		// TODO Auto-generated method stub
		leaveRequestsDAO.addLeaveRequests(leaveRequests);
	}

	@Override
	public void updateLeaveRequests(LeaveRequests leaveRequests) {
		// TODO Auto-generated method stub
		leaveRequestsDAO.updateLeaveRequests(leaveRequests);
	}

	@Override
	public void deleteLeaveRequests(LeaveRequests leaveRequests) {
		// TODO Auto-generated method stub
		leaveRequestsDAO.deleteLeaveRequests(leaveRequests);
	}

	@Override
	public LeaveRequests getLeaveRequestsById(int leaveRequestId) {
		// TODO Auto-generated method stub
		return leaveRequestsDAO.getLeaveRequestsById(leaveRequestId);
	}

}
