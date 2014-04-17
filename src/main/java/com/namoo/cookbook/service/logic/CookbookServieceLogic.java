package com.namoo.cookbook.service.logic;

import org.springframework.stereotype.Service;

import com.namoo.cookbook.domain.Cookbook;
import com.namoo.cookbook.domain.Recipe;
import com.namoo.cookbook.service.facade.CookbookService;

//service annot-을 붙여서 bean으로 등록
@Service
public class CookbookServieceLogic implements CookbookService{
	//
	
	@Override
	public Cookbook getCookbook() {
		// 
		Cookbook cookbook = new Cookbook("Namoosori cookbook", "Namoosori");
		cookbook.addRecipe(new Recipe("김치찌개", "김치, 돼지고기", "1. 김치 넣고 끓인다."));
		cookbook.addRecipe(new Recipe("된장찌개", "된장, 돼지고기", "1. 된장 넣고 끓인다."));
		
		return cookbook;
	}

	@Override
	public void registerRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeRecipe(String recipeName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Recipe getRecipe(String recipeName) {
		// TODO Auto-generated method stub
		return null;
	}
	//
	
}
