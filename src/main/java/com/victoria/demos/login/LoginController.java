//package com.victoria.demos.login;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//@Controller
//@SessionAttributes("user")
//public class LoginController {
//
//	@Autowired
//	LoginService loginService;
//	
//
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String showWelcomePage(ModelMap model) {
//		model.put("user", "An Author");
//		return "welcome";
//	}
//
//}
