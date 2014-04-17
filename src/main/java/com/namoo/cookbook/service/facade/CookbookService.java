package com.namoo.cookbook.service.facade;

import org.springframework.stereotype.Service;

import com.namoo.cookbook.domain.Cookbook;
import com.namoo.cookbook.domain.Recipe;

@Service
public interface CookbookService {
	//CRUD
	
	/**
	 * 요리책을 조회한다.
	 * 
	 * @return {@link Cookbook} cookbook 객체 반환
	 */
	Cookbook getCookbook();
	
	/**
	 * 조리법을 등록한다.
	 * @param recipe 조리법
	 */
	void registerRecipe(Recipe recipe);
	
	/**
	 * 조리법을 수정한다.
	 * 
	 * @param recipe 조리법
	 */
	void modifyRecipe(Recipe recipe);
	
	/**
	 * 조리법을 삭제한다.
	 * @param recipeName 조리명
	 */
	void removeRecipe(String recipeName);
	
	/**
	 * 조리명으로 조리법을 조회한다.
	 * 
	 * @param recipeName 조리명
	 * @return {@link Recipe} 조리법 객체 반환
	 */
	Recipe getRecipe(String recipeName);

}
