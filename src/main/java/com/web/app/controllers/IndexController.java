package com.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/app")
public class IndexController {
	
	@RequestMapping(path = { "/", "","/index"} )
	public String index(Model model) {
	
		return "index";
	}

}
