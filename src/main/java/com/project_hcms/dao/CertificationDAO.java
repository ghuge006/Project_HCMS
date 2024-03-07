package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.Certifications;

public interface CertificationDAO {
	List<Certifications> getAllCertification();

	void addCertification(Certifications certification);

	void updateCertification(Certifications certification);

	void deleteCertification(Certifications certification);
	
	Certifications getCertificationById(int certificationId);
}
