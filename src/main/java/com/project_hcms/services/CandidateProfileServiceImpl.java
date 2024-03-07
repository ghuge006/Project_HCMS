package com.project_hcms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_hcms.dao.CandidateProfileDAO;
import com.project_hcms.entities.CandidateProfiles;
@Service
public class CandidateProfileServiceImpl implements CandidateProfileService {

	@Autowired
	CandidateProfileDAO candidateProfileDAO;
	@Override
	public List<CandidateProfiles> getAllCandidateProfile() {
		// TODO Auto-generated method stub
		return candidateProfileDAO.getAllCandidateProfile();
	}

	@Override
	public void addCandidateProfile(CandidateProfiles candidateProfile) {
		candidateProfileDAO.addCandidateProfile(candidateProfile);
		
	}

	@Override
	public void updateCandidateProfile(CandidateProfiles candidateProfile) {
		candidateProfileDAO.updateCandidateProfile(candidateProfile);		
	}

	@Override
	public void deleteCandidateProfile(CandidateProfiles candidateProfile) {
		candidateProfileDAO.deleteCandidateProfile(candidateProfile);		
	}

	@Override
	public CandidateProfiles getCandidateProfileById(int candidateId) {
		// TODO Auto-generated method stub
		return candidateProfileDAO.getCandidateProfileById(candidateId);
	}

}
