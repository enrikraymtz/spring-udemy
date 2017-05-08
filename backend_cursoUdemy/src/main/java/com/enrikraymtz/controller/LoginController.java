package com.enrikraymtz.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.enrikraymtz.constant.ViewConstant;

@Controller
public class LoginController {

	private Log LOG = LogFactory.getLog(LoginController.class);

	@GetMapping("/login")
	public String showFormLogin(Model model, @RequestParam(name = "logout", required = false) String logout,
			@RequestParam(name = "error", required = false) String error) {
		LOG.info("METHOD: showFormLogin() -- PARAMS: error=" + error + ", logout:" + logout);
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		LOG.info("Retornando vista login");
		return ViewConstant.LOGIN;
	}

	@GetMapping({ "/loginsuccess", "/" })
	public String loginCheck() {
		LOG.info("METHOD: loginCheck()");
		LOG.info("Retornando vista contacto");
		return "redirect:/contacts/showcontacts";
	}
}
