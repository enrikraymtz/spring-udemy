package com.enrikraymtz.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.enrikraymtz.model.Persona;

@Controller
@RequestMapping("/ejemplo3")
public class Ejemplo3Controller {

	private static final Log LOGGER = LogFactory.getLog(Ejemplo3Controller.class);
	
	private static final String FORM_VIEW = "form";
	private static final String RESULT_VIEW = "result";
	
	//Primera forma
	/*
	@GetMapping("/")
	public String redirect(){
		return "redirect:/ejemplo3/showform";
	}
	*/
	
	//Segunda forma
	@GetMapping("/")
	public RedirectView redirect() {
		return new RedirectView("/ejemplo3/showform");
	}
	
	@GetMapping("/showform")
	public String showForm(Model model){
		model.addAttribute("persona", new Persona());
		return FORM_VIEW;
	}
	
	@PostMapping("/addperson")
	public ModelAndView addPerson(@Valid @ModelAttribute("person") Persona persona, BindingResult bindingResult ){
		ModelAndView mav = new ModelAndView();
		if(bindingResult.hasErrors()){
			mav.setViewName(FORM_VIEW);
		}else{			
			mav.setViewName(RESULT_VIEW);
			mav.addObject("persona", persona);
		}		
		return mav;
	}
}
