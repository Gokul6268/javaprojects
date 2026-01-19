package com.amazon.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.amazon.profile.controller.ProfileController;
import com.amazon.profile.controller.exception.ProfileAlreadyRegisteredException;
import com.amazon.profile.entity.ProfileEntity;
import com.amazon.profile.repository.ProfileRepository;
import com.amazon.profile.request.ProfileRequest;

@Repository
public class ProfileService {

	private final ProfileController profileController;

	@Autowired
	ProfileRepository profileRepository;

	ProfileService(ProfileController profileController) {
		this.profileController = profileController;
	}

	public int createProfile(ProfileRequest profileRequest) {
		System.out.println("ProfileService.createProfile() :::" + profileRequest.getMobile());

		ProfileEntity profileEntity = new ProfileEntity();

		profileEntity.setEmail(profileRequest.getEmail());
		profileEntity.setMobile(profileRequest.getMobile());
		Integer response = null;

		ProfileEntity profileEntityForEmail = profileRepository.getProfileByEmail(profileRequest.getEmail());

	if (profileEntityForEmail == null) {
			response = profileRepository.saveProfile(profileEntity);
		} else {
			throw new ProfileAlreadyRegisteredException("PEC-001");
		}
		System.out.println("ProfileService.createProfile()::: profile created... " + response.intValue());
		return response;
	}

}
