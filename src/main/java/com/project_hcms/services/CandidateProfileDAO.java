package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.CandidateProfiles;

public interface CandidateProfileDAO {
	List<CandidateProfiles> getAllCandidateProfile();

	void addCandidateProfile(CandidateProfiles candidateProfile);

	void updateCandidateProfile(CandidateProfiles candidateProfile);

	void deleteCandidateProfile(int candidateId);
	
	CandidateProfiles getCandidateProfileById(int candidateId);
}
