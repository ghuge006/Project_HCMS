package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.CertificationDAO;
import com.project_hcms.entities.Certifications;
@Service
public class CertificationServiceImpl implements CertificationService{

	@Autowired
	CertificationDAO certificationDAO;
	@Override
	public List<Certifications> getAllCertification() {
		// TODO Auto-generated method stub
		return certificationDAO.getAllCertification();
	}

	@Override
	public void addCertification(Certifications certification) {
		certificationDAO.addCertification(certification);
		
	}

	@Override
	public void updateCertification(Certifications certification) {
		certificationDAO.updateCertification(certification);
		
	}

	@Override
	public void deleteCertification(Certifications certification) {
		certificationDAO.deleteCertification(certification);
		
	}

	@Override
	public Certifications getCertificationById(int certificationId) {
		// TODO Auto-generated method stub
		return certificationDAO.getCertificationById(certificationId);
	}

}
