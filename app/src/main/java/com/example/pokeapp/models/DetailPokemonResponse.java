package com.example.pokeapp.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DetailPokemonResponse{

	@SerializedName("location_area_encounters")
	private String locationAreaEncounters;

	@SerializedName("types")
	private List<TypesItem> types;

	@SerializedName("base_experience")
	private int baseExperience;

	@SerializedName("held_items")
	private List<Object> heldItems;

	@SerializedName("weight")
	private int weight;

	@SerializedName("is_default")
	private boolean isDefault;

	@SerializedName("past_types")
	private List<Object> pastTypes;

	@SerializedName("sprites")
	private Sprites sprites;

	@SerializedName("abilities")
	private List<AbilitiesItem> abilities;

	@SerializedName("game_indices")
	private List<GameIndicesItem> gameIndices;

	@SerializedName("species")
	private Species species;

	@SerializedName("stats")
	private List<StatsItem> stats;

	@SerializedName("moves")
	private List<MovesItem> moves;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("forms")
	private List<FormsItem> forms;

	@SerializedName("height")
	private int height;

	@SerializedName("order")
	private int order;

	public String getLocationAreaEncounters(){
		return locationAreaEncounters;
	}

	public List<TypesItem> getTypes(){
		return types;
	}

	public int getBaseExperience(){
		return baseExperience;
	}

	public List<Object> getHeldItems(){
		return heldItems;
	}

	public int getWeight(){
		return weight;
	}

	public boolean isIsDefault(){
		return isDefault;
	}

	public List<Object> getPastTypes(){
		return pastTypes;
	}

	public Sprites getSprites(){
		return sprites;
	}

	public List<AbilitiesItem> getAbilities(){
		return abilities;
	}

	public List<GameIndicesItem> getGameIndices(){
		return gameIndices;
	}

	public Species getSpecies(){
		return species;
	}

	public List<StatsItem> getStats(){
		return stats;
	}

	public List<MovesItem> getMoves(){
		return moves;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public List<FormsItem> getForms(){
		return forms;
	}

	public int getHeight(){
		return height;
	}

	public int getOrder(){
		return order;
	}

	@Override
 	public String toString(){
		return 
			"DetailPokemonResponse{" + 
			"location_area_encounters = '" + locationAreaEncounters + '\'' + 
			",types = '" + types + '\'' + 
			",base_experience = '" + baseExperience + '\'' + 
			",held_items = '" + heldItems + '\'' + 
			",weight = '" + weight + '\'' + 
			",is_default = '" + isDefault + '\'' + 
			",past_types = '" + pastTypes + '\'' + 
			",sprites = '" + sprites + '\'' + 
			",abilities = '" + abilities + '\'' + 
			",game_indices = '" + gameIndices + '\'' + 
			",species = '" + species + '\'' + 
			",stats = '" + stats + '\'' + 
			",moves = '" + moves + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",forms = '" + forms + '\'' + 
			",height = '" + height + '\'' + 
			",order = '" + order + '\'' + 
			"}";
		}
}