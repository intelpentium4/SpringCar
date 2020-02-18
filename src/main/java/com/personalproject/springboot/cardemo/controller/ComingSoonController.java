package com.personalproject.springboot.cardemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComingSoonController {
	
	// create mapping for "comingSoon"
	@GetMapping("/comingSoon")
	public String comingSoon(Model theModel) {
		
		theModel.addAttribute("theDate", new java.util.Date());
		return "coming-soon";
	}

}
