package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.LeaveTypes;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class LeaveTypeDAOImpl implements LeaveTypeDAO{
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<LeaveTypes> getAllLeaveType() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from LeaveTypes", LeaveTypes.class).getResultList();
	}

	@Override
	public void addLeaveType(LeaveTypes leaveType) {
		entityManager.unwrap(Session.class).saveOrUpdate(leaveType);
		
	}

	@Override
	public void updateLeaveType(LeaveTypes leaveType) {
		entityManager.unwrap(Session.class).merge(leaveType);
		
	}

	@Override
	public void deleteLeaveType(LeaveTypes leaveType) {
		entityManager.unwrap(Session.class).remove(leaveType);
		
	}

	@Override
	public LeaveTypes getLeaveTypeById(int leaveTypeId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(LeaveTypes.class,leaveTypeId);
	}

}
