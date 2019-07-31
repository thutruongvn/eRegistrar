package edu.mum.cs.cs425.demowebapps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping(value = {"/eRegistrar", "/eRegistrar/home"})
	public String displayHomepage() {
		return "home/index";
	}

}
