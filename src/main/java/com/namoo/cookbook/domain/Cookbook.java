package com.namoo.cookbook.domain;

import java.util.List;

public class Cookbook {
	
	private String name = "정 쉐프의 요리책";//cookbook's name
	private String writer = "정효진";
	private List<Recipe> recipes;
	//-----------------------------------------------------------------------------------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public List<Recipe> getRecipes() {
		return recipes;
	}
	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}
	

}
