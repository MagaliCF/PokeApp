package com.example.pokeapp.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MovesItem{

	@SerializedName("version_group_details")
	private List<VersionGroupDetailsItem> versionGroupDetails;

	@SerializedName("move")
	private Move move;

	public List<VersionGroupDetailsItem> getVersionGroupDetails(){
		return versionGroupDetails;
	}

	public Move getMove(){
		return move;
	}

	@Override
 	public String toString(){
		return 
			"MovesItem{" + 
			"version_group_details = '" + versionGroupDetails + '\'' + 
			",move = '" + move + '\'' + 
			"}";
		}
}