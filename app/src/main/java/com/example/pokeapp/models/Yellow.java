package com.example.pokeapp.models;

import com.google.gson.annotations.SerializedName;

public class Yellow{

	@SerializedName("front_gray")
	private String frontGray;

	@SerializedName("back_transparent")
	private String backTransparent;

	@SerializedName("back_default")
	private String backDefault;

	@SerializedName("back_gray")
	private String backGray;

	@SerializedName("front_default")
	private String frontDefault;

	@SerializedName("front_transparent")
	private String frontTransparent;

	public String getFrontGray(){
		return frontGray;
	}

	public String getBackTransparent(){
		return backTransparent;
	}

	public String getBackDefault(){
		return backDefault;
	}

	public String getBackGray(){
		return backGray;
	}

	public String getFrontDefault(){
		return frontDefault;
	}

	public String getFrontTransparent(){
		return frontTransparent;
	}

	@Override
 	public String toString(){
		return 
			"Yellow{" + 
			"front_gray = '" + frontGray + '\'' + 
			",back_transparent = '" + backTransparent + '\'' + 
			",back_default = '" + backDefault + '\'' + 
			",back_gray = '" + backGray + '\'' + 
			",front_default = '" + frontDefault + '\'' + 
			",front_transparent = '" + frontTransparent + '\'' + 
			"}";
		}
}