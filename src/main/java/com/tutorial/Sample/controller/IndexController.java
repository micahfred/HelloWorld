package com.tutorial.Sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/a")
@Slf4j
public class IndexController {

	@RequestMapping("/index")
	public String indexPage() {
		log.info("index");
		return "index";
	}
	
	@RequestMapping("/index1")
	public ModelAndView indexPage1() {
		log.info("index1");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "111");
		mv.setViewName("index");
		return mv;
	}
	
	
}
