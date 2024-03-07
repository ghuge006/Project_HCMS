package com.project_hcms.dao;

import java.util.List;

import com.project_hcms.entities.CandidateProfiles;

public interface CandidateProfileDAO {
	List<CandidateProfiles> getAllCandidateProfile();

	void addCandidateProfile(CandidateProfiles candidateProfile);

	void updateCandidateProfile(CandidateProfiles candidateProfile);

	void deleteCandidateProfile(CandidateProfiles candidateProfile);
	
	CandidateProfiles getCandidateProfileById(int candidateId);
}
