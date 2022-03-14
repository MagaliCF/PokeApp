package com.example.pokeapp.models;

import com.google.gson.annotations.SerializedName;

public class DreamWorld{

	@SerializedName("front_default")
	private String frontDefault;

	@SerializedName("front_female")
	private Object frontFemale;

	public String getFrontDefault(){
		return frontDefault;
	}

	public Object getFrontFemale(){
		return frontFemale;
	}

	@Override
 	public String toString(){
		return 
			"DreamWorld{" + 
			"front_default = '" + frontDefault + '\'' + 
			",front_female = '" + frontFemale + '\'' + 
			"}";
		}
}