package com.n2015642087.main.controller;

import com.n2015642087.main.domain.Basic;
import com.n2015642087.main.domain.Profile;
import com.n2015642087.main.repository.BasicRepository;
import com.n2015642087.main.repository.ProfileRepository;
import com.n2015642087.main.service.BasicService;
import com.n2015642087.main.service.ProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;


@Controller
public class BoardController {
    private BasicService basicService;
    private BasicRepository basicRepository;
    private ProfileService profileService;
    private ProfileRepository profileRepository;

    public BoardController(BasicService basicService, BasicRepository basicRepository, ProfileService profileService, ProfileRepository profileRepository) {
        this.basicService = basicService;
        this.basicRepository = basicRepository;
        this.profileService = profileService;
        this.profileRepository = profileRepository;
    }

    @GetMapping("/")
    public String list(Model model){
        model.addAttribute("basicList", basicService.findAll());
        model.addAttribute("profileList", profileService.findAll());
        return "index";
    }

    @GetMapping("/basic/{idx}")
    public String readBasic(@PathVariable Long idx, Model model){
        model.addAttribute("basic",basicService.findBasicByIdx(idx));
        return "itembasic";
    }
    @GetMapping("/profile/{idx}")
    public String readProfile(@PathVariable Long idx, Model model){
        model.addAttribute("profile",profileService.findProfileByIdx(idx));
        return "itemprofile";
    }
    @GetMapping("/basic/new")
    public String formBasic(Basic basic){return "newbasic";}

    @GetMapping("/profile/new")
    public String formProfile(Profile profile){return "newprofile";}

    @PostMapping("/basic/add")
    public String addBasic(Basic basic, Model model){
        basic.setCreatedDate(LocalDateTime.now());
        basic.setUpdatedDate(LocalDateTime.now());
        Basic saveBasic = basicRepository.save(basic);
        model.addAttribute("basic",basicService.findBasicByIdx(saveBasic.getIdx()));
        return "itembasic";
    }
    @PostMapping("/profile/add")
    public String addProfile(Profile profile, Model model){
        profile.setCreatedDate(LocalDateTime.now());
        profile.setUpdatedDate(LocalDateTime.now());
        Profile saveProfile = profileRepository.save(profile);
        model.addAttribute("profile",profileService.findProfileByIdx(saveProfile.getIdx()));
        return "itemprofile";
    }
}
