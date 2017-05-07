package com.enrikraymtz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.enrikraymtz.component.ExampleComponent;

import com.enrikraymtz.service.ExampleService;

@Controller 
@RequestMapping("/ejemplo")
public class EjemploController {
	
	public static final String EJEMPLO_VIEW = "ejemplo";
	
	@Autowired
	@Qualifier("exampleService")
	private ExampleService exampleService;
	
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent;
	
	//Primera forma
	@RequestMapping(value="/ejemploString", method = RequestMethod.GET)
	public String ejemploString(Model model){
		exampleComponent.sayHello();
		model.addAttribute("people", exampleService.getListPeople());
		return EJEMPLO_VIEW;
	}
	
	//Segunda Forma
	@GetMapping("/ejemploMAV")
	public ModelAndView ejemploMAV(){
		ModelAndView mav = new ModelAndView(EJEMPLO_VIEW);
		mav.addObject("people", exampleService.getListPeople());
		return mav;
	}
	
}
