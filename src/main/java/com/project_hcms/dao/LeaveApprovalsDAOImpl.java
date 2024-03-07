package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.LeaveApprovals;


import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class LeaveApprovalsDAOImpl implements LeaveApprovalsDAO {
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<LeaveApprovals> getAllLeaveApprovals() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from LeaveApprovals", LeaveApprovals.class).getResultList();
	}

	@Override
	public void addLeaveApprovals(LeaveApprovals leaveApprovals) {
		entityManager.unwrap(Session.class).saveOrUpdate(leaveApprovals);
		
	}

	@Override
	public void updateLeaveApprovals(LeaveApprovals leaveApprovals) {
		entityManager.unwrap(Session.class).merge(leaveApprovals);
		
	}

	@Override
	public void deleteLeaveApprovals(LeaveApprovals leaveApprovals) {
		entityManager.unwrap(Session.class).remove(leaveApprovals);
		
	}

	@Override
	public LeaveApprovals getLeaveApprovalsById(int approvalId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(LeaveApprovals.class,approvalId);
	}

}
