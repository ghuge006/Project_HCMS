package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.LeaveRequests;


import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class LeaveRequestsDAOImpl implements LeaveRequestsDAO{
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<LeaveRequests> getAllLeaveRequests() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from LeaveRequests", LeaveRequests.class).getResultList();
	}

	@Override
	public void addLeaveRequests(LeaveRequests leaveRequests) {
		entityManager.unwrap(Session.class).saveOrUpdate(leaveRequests);
		
	}

	@Override
	public void updateLeaveRequests(LeaveRequests leaveRequests) {
		entityManager.unwrap(Session.class).merge(leaveRequests);
		
	}

	@Override
	public void deleteLeaveRequests(LeaveRequests leaveRequests) {
		entityManager.unwrap(Session.class).remove(leaveRequests);
		
	}

	@Override
	public LeaveRequests getLeaveRequestsById(int leaveRequestId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(LeaveRequests.class,leaveRequestId);
	}

}
