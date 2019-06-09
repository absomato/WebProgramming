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


@Controller
public class BasicController {
    private BasicService basicService;
    private BasicRepository basicRepository;
    private ProfileService profileService;
    private ProfileRepository profileRepository;

    public BasicController(BasicService basicService, BasicRepository basicRepository, ProfileService profileService, ProfileRepository profileRepository) {
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
    public String formbasic(Basic basic){return "newbasic";}

    @GetMapping("/profile/new")
    public String formprofile(Profile profile){return "newprofile";}

}
