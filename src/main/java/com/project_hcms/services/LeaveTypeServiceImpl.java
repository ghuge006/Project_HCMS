package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.LeaveTypeDAO;
import com.project_hcms.entities.LeaveTypes;
@Service
public class LeaveTypeServiceImpl implements LeaveTypeService{

	@Autowired
	LeaveTypeDAO leaveTypeDAO;
	@Override
	public List<LeaveTypes> getAllLeaveType() {
		// TODO Auto-generated method stub
		return leaveTypeDAO.getAllLeaveType();
	}

	@Override
	public void addLeaveType(LeaveTypes leaveType) {
		// TODO Auto-generated method stub
		leaveTypeDAO.addLeaveType(leaveType);
	}

	@Override
	public void updateLeaveType(LeaveTypes leaveType) {
		// TODO Auto-generated method stub
		leaveTypeDAO.updateLeaveType(leaveType);
	}

	@Override
	public void deleteLeaveType(LeaveTypes leaveType) {
		// TODO Auto-generated method stub
		leaveTypeDAO.deleteLeaveType(leaveType);
	}

	@Override
	public LeaveTypes getLeaveTypeById(int leaveTypeId) {
		// TODO Auto-generated method stub
		return leaveTypeDAO.getLeaveTypeById(leaveTypeId);
	}

}
