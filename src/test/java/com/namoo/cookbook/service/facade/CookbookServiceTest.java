package com.namoo.cookbook.service.facade;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.namoo.cookbook.domain.Cookbook;
import com.namoo.cookbook.domain.Recipe;

public class CookbookServiceTest {
	//
	private CookbookService cookbookService;
	
	@Before
	public void setUp() throws Exception {
		//
//		generic
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-test.xml");
		this.cookbookService = ac.getBean(CookbookService.class);
	}

	@Test
	public void testGetCookbook() {
		//
		Cookbook cookbook = cookbookService.getCookbook();
		
		//assertion
		assertThat(cookbook.getName(), is("Namoosori cookbook"));
		assertThat(cookbook.getWriter(), is("Namoosori"));
		
		//김치찌개, 된장찌개
		assertThat(cookbook.getRecipes().size(), is(2));
		Recipe recipe = cookbook.getRecipes().get(0);
		
		assertThat(recipe.getName(),  is("김치찌개"));
	}

	@Test
	public void testRegisterRecipe() {
		//
		Recipe recipe = new Recipe();
		recipe.setName("매운갈비찜");
		recipe.setIngredients("갈비, 김치, 고추장");
		recipe.setProcedure("1. 목우촌을 가서 먹는다.");
		
		cookbookService.registerRecipe(recipe);
		
		//assertion
		// TODO : 검증 할 방법이 아직 없다.저장이 안되기 때문에 확인할 수 없다.
	}

	// 귀찮아서 뺀다.
//	@Test
//	public void testModifyRecipe() {
//		//
//		
//	}
//
//	@Test
//	public void testRemoveRecipe() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testGetRecipe() {
		//
		Recipe recipe = cookbookService.getRecipe("김치찌개");
		
		// assertion
		assertThat(recipe.getName(), is("김치찌개"));
		assertThat(recipe.getIngredients(), is("김치, 돼지고기"));
		assertThat(recipe.getProcedure(), is("1. 김치 넣고 끓인다."));
	}

}
