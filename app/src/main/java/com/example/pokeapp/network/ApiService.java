package com.example.pokeapp.network;

import com.example.pokeapp.models.DetailPokemonResponse;
import com.example.pokeapp.models.PokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    //Get pokemon names
    @GET("pokemon")
    Call<PokemonResponse> getPokemonList(@Query("limit") int limit, @Query("offset") int offset );

    //Get pokemon detail
    @GET("pokemon/{id}")
    Call<DetailPokemonResponse> getPokemonById(@Path("id") String id);
}
