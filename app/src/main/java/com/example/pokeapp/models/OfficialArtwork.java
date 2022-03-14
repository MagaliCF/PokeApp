package com.example.pokeapp.models;

import com.google.gson.annotations.SerializedName;

public class OfficialArtwork{

	@SerializedName("front_default")
	private String frontDefault;

	public String getFrontDefault(){
		return frontDefault;
	}

	@Override
 	public String toString(){
		return 
			"OfficialArtwork{" + 
			"front_default = '" + frontDefault + '\'' + 
			"}";
		}
}