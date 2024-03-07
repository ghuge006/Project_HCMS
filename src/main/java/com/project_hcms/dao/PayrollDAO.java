package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.Payroll;

public interface PayrollDAO {
	List<Payroll> getAllPayroll();

	void addPayroll(Payroll payroll);

	void updatePayroll(Payroll payroll);

	void deletePayroll(Payroll payroll);
	
	Payroll getPayrollById(int payrollId);
}
