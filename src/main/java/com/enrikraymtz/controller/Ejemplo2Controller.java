package com.enrikraymtz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ejemplo2")
public class Ejemplo2Controller {
	
	private static final String EJEMPLO2_VIEW = "ejemplo2";
	
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name="nm", required=false, defaultValue="NULL") String name){
		ModelAndView mav = new ModelAndView(EJEMPLO2_VIEW);
		mav.addObject("nm_in_model", name);
		return mav;
	}
	
	@GetMapping("/request2/{nm}")
	public ModelAndView request2(@PathVariable(name="nm") String name){
		ModelAndView mav = new ModelAndView(EJEMPLO2_VIEW);
		mav.addObject("nm_in_model", name);
		return mav;
	}
}
