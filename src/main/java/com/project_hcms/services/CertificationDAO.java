package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.Certifications;

public interface CertificationDAO {
	List<Certifications> getAllCertification();

	void addCertification(Certifications certification);

	void updateCertification(Certifications certification);

	void deleteCertification(int certificationId);
	
	Certifications getCertificationById(int certificationId);
}
