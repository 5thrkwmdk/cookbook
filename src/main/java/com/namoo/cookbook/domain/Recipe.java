package com.namoo.cookbook.domain;

public class Recipe {
	//field
	
	private String name; //요리 이름
	private String ingredients; // 재료 list X. 복잡
	private String procedure; // 조리법
	
	//-------------------------------------------------------------------------
	// constructor
	
	public Recipe() {
		//
	}
	public Recipe(String name, String ingredients, String procedure) {
		//
		this.name = name;
		this.ingredients = ingredients;
		this.procedure = procedure;
	}
	
	//-------------------------------------------------------------------------
	//getter/setter
	
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
	public String getProcedure() {
		return procedure;
	}
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}
}
