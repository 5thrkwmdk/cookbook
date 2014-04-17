package com.namoo.cookbook.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.namoo.cookbook.domain.Cookbook;
import com.namoo.cookbook.service.facade.CookbookService;

@Controller //controller로 등록
public class CookbookController {
	//
	@Autowired
	private CookbookService cookbookService;
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public ModelAndView cookbook() {
		//
		Cookbook cookbook = cookbookService.getCookbook();
		return new ModelAndView("/cookbook", "cookbook", cookbook);
	}

}
