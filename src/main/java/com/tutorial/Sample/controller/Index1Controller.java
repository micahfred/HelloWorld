package com.tutorial.Sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/b")


public class Index1Controller {

	@RequestMapping("/index1")
	public String index1Page(Model model){
		model.addAttribute("name","Test");
		return "index1"; 
	}
}
