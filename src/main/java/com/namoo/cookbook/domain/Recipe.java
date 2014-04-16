package com.namoo.cookbook.domain;

public class Recipe {
	//
	private String name; //cook's name
	private String ingredients; // 재료 list X. 복잡
	private String recipe;
	//------------------------------------------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getRecipe() {
		return recipe;
	}
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	

}
