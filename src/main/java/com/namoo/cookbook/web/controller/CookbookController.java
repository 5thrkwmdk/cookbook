package com.namoo.cookbook.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cookbook")
public class CookbookController {
	//
//	@Autowired
//	private Cookbook cookbook;
	
	@RequestMapping(value = "/chapters")
	public String chapters() {
		//
		
		return "cookbook";
	}
}
