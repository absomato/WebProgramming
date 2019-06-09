package com.n2015642087.main.service;

import com.n2015642087.main.domain.Profile;
import com.n2015642087.main.repository.ProfileRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public List<Profile> findAll(){
        return profileRepository.findAll();
    }
    public Profile findProfileByIdx(Long idx){return profileRepository.findById(idx).orElse(new Profile()); }
}
