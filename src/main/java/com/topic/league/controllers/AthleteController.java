package com.topic.league.controllers;

import com.topic.league.repositories.AthleteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AthleteController {

    private final AthleteRepository athleteRepository;

    public AthleteController(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    @GetMapping("/athletes")
    public String listAthletes(Model model){

        model.addAttribute("athletes", athleteRepository.findAll());
        return "athletes-list";
    }
}
