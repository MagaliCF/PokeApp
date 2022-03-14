package com.example.pokeapp.models;

import com.google.gson.annotations.SerializedName;

public class UltraSunUltraMoon{

	@SerializedName("front_shiny_female")
	private Object frontShinyFemale;

	@SerializedName("front_default")
	private String frontDefault;

	@SerializedName("front_female")
	private Object frontFemale;

	@SerializedName("front_shiny")
	private String frontShiny;

	public Object getFrontShinyFemale(){
		return frontShinyFemale;
	}

	public String getFrontDefault(){
		return frontDefault;
	}

	public Object getFrontFemale(){
		return frontFemale;
	}

	public String getFrontShiny(){
		return frontShiny;
	}

	@Override
 	public String toString(){
		return 
			"UltraSunUltraMoon{" + 
			"front_shiny_female = '" + frontShinyFemale + '\'' + 
			",front_default = '" + frontDefault + '\'' + 
			",front_female = '" + frontFemale + '\'' + 
			",front_shiny = '" + frontShiny + '\'' + 
			"}";
		}
}