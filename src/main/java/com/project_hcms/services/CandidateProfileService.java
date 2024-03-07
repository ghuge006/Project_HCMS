package com.project_hcms.services;

import java.util.List;

import com.project_hcms.entities.CandidateProfiles;

public interface CandidateProfileService {
	List<CandidateProfiles> getAllCandidateProfile();

	void addCandidateProfile(CandidateProfiles candidateProfile);

	void updateCandidateProfile(CandidateProfiles candidateProfile);

	void deleteCandidateProfile(CandidateProfiles candidateProfile);
	
	CandidateProfiles getCandidateProfileById(int candidateId);
}
