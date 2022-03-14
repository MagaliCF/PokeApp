package com.example.pokeapp.models;

import com.google.gson.annotations.SerializedName;

public class GenerationViii{

	@SerializedName("icons")
	private Icons icons;

	public Icons getIcons(){
		return icons;
	}

	@Override
 	public String toString(){
		return 
			"GenerationViii{" + 
			"icons = '" + icons + '\'' + 
			"}";
		}
}