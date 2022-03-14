package com.example.pokeapp.models;

import com.google.gson.annotations.SerializedName;

public class Emerald{

	@SerializedName("front_default")
	private String frontDefault;

	@SerializedName("front_shiny")
	private String frontShiny;

	public String getFrontDefault(){
		return frontDefault;
	}

	public String getFrontShiny(){
		return frontShiny;
	}

	@Override
 	public String toString(){
		return 
			"Emerald{" + 
			"front_default = '" + frontDefault + '\'' + 
			",front_shiny = '" + frontShiny + '\'' + 
			"}";
		}
}