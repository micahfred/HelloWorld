package com.tutorial.Sample.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tutorial.Sample.Form.Assets;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/assets")
@Slf4j

public class AssetsController {
	
	@GetMapping("/")
	public String getPackage() {
		return "assets";
	}
	
	@PostMapping("/")
	public String save(Model model,@Valid Assets form,BindingResult br) {
		if(br.hasErrors()) {
			return "assets";
		}
		log.info("form111111111111111111"+form);
		model.addAttribute("assets",form);
		return "redirect:/assets/";
		}
	
	@ModelAttribute("assets")
	public Assets assets(){
		return new Assets();
	}
		
}
	
