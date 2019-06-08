package com.n2015642087.main.controller;

import com.n2015642087.main.repository.BasicRepository;
import com.n2015642087.main.service.BasicService;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.print.Pageable;

@Controller
public class BasicController {
    private BasicService basicService;
    private BasicRepository basicRepository;

    public BasicController(BasicService basicService, BasicRepository basicRepository) {
        this.basicService = basicService;
        this.basicRepository = basicRepository;
    }

    @GetMapping("/")
    public String list(@PageableDefault Pageable pageable, Model model){
        model.addAttribute("basicList", basicService.findBasicList(pageable));
        return "index";
    }

}
