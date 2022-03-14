package com.example.pokeapp.models;

import com.google.gson.annotations.SerializedName;

public class Other{

	@SerializedName("dream_world")
	private DreamWorld dreamWorld;

	@SerializedName("official-artwork")
	private OfficialArtwork officialArtwork;

	@SerializedName("home")
	private Home home;

	public DreamWorld getDreamWorld(){
		return dreamWorld;
	}

	public OfficialArtwork getOfficialArtwork(){
		return officialArtwork;
	}

	public Home getHome(){
		return home;
	}

	@Override
 	public String toString(){
		return 
			"Other{" + 
			"dream_world = '" + dreamWorld + '\'' + 
			",official-artwork = '" + officialArtwork + '\'' + 
			",home = '" + home + '\'' + 
			"}";
		}
}