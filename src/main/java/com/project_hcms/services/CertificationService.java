package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.Certifications;

public interface CertificationService {
	List<Certifications> getAllCertification();

	void addCertification(Certifications certification);

	void updateCertification(Certifications certification);

	void deleteCertification(Certifications certification);
	
	Certifications getCertificationById(int certificationId);
}
