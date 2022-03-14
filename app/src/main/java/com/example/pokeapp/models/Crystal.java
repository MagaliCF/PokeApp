package com.example.pokeapp.models;

import com.google.gson.annotations.SerializedName;

public class Crystal{

	@SerializedName("back_transparent")
	private String backTransparent;

	@SerializedName("back_shiny_transparent")
	private String backShinyTransparent;

	@SerializedName("back_default")
	private String backDefault;

	@SerializedName("front_default")
	private String frontDefault;

	@SerializedName("front_transparent")
	private String frontTransparent;

	@SerializedName("front_shiny_transparent")
	private String frontShinyTransparent;

	@SerializedName("back_shiny")
	private String backShiny;

	@SerializedName("front_shiny")
	private String frontShiny;

	public String getBackTransparent(){
		return backTransparent;
	}

	public String getBackShinyTransparent(){
		return backShinyTransparent;
	}

	public String getBackDefault(){
		return backDefault;
	}

	public String getFrontDefault(){
		return frontDefault;
	}

	public String getFrontTransparent(){
		return frontTransparent;
	}

	public String getFrontShinyTransparent(){
		return frontShinyTransparent;
	}

	public String getBackShiny(){
		return backShiny;
	}

	public String getFrontShiny(){
		return frontShiny;
	}

	@Override
 	public String toString(){
		return 
			"Crystal{" + 
			"back_transparent = '" + backTransparent + '\'' + 
			",back_shiny_transparent = '" + backShinyTransparent + '\'' + 
			",back_default = '" + backDefault + '\'' + 
			",front_default = '" + frontDefault + '\'' + 
			",front_transparent = '" + frontTransparent + '\'' + 
			",front_shiny_transparent = '" + frontShinyTransparent + '\'' + 
			",back_shiny = '" + backShiny + '\'' + 
			",front_shiny = '" + frontShiny + '\'' + 
			"}";
		}
}