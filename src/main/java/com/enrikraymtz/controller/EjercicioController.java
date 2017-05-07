package com.enrikraymtz.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.enrikraymtz.service.EjercicioService;

@Controller
@RequestMapping("/ejercicio")
public class EjercicioController {
	
	private long time;
	private static final String EJERCICIO_VIEW = "ejercicio";
	private static final Log LOG = LogFactory.getLog(EjercicioController.class);
	
	@Autowired
	@Qualifier("ejercicioService")
	private EjercicioService ejercicioService;
	
	@RequestMapping(value="/ejercicio1")
	public String redirect(){
		time = System.currentTimeMillis();
		return "redirect:/ejercicio/ejercicio2";
	}
	
	@RequestMapping(value="/ejercicio2")
	public ModelAndView ejercicio2(){
		ModelAndView mav = new ModelAndView(EJERCICIO_VIEW);
		mav.addObject("mensajes",  ejercicioService.getListMensaje());
		return mav;
	}
}
