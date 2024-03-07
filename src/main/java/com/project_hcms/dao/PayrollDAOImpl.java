package com.project_hcms.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project_hcms.entities.Payroll;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class PayrollDAOImpl implements PayrollDAO {
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<Payroll> getAllPayroll() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from Payroll", Payroll.class).getResultList();
	}

	@Override
	public void addPayroll(Payroll payroll) {
		entityManager.unwrap(Session.class).saveOrUpdate(payroll);
		
	}

	@Override
	public void updatePayroll(Payroll payroll) {
		entityManager.unwrap(Session.class).merge(payroll);
		
	}

	@Override
	public void deletePayroll(Payroll payroll) {
		entityManager.unwrap(Session.class).remove(payroll);
		
	}

	@Override
	public Payroll getPayrollById(int payrollId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(Payroll.class,payrollId);
	}

}
