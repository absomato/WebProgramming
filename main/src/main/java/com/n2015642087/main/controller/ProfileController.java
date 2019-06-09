package com.n2015642087.main.controller;

import com.n2015642087.main.repository.ProfileRepository;
import com.n2015642087.main.service.ProfileService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
    private ProfileService profileService;
    private ProfileRepository profileRepository;

    public ProfileController(ProfileService profileService, ProfileRepository profileRepository) {
        this.profileService = profileService;
        this.profileRepository = profileRepository;
    }

//    @GetMapping("/")
//    public String list(@PageableDefault Pageable pageable, Model model) {
//        model.addAttribute("profileList", profileService.findProfileList(pageable));
//        return "index";
//    }
}