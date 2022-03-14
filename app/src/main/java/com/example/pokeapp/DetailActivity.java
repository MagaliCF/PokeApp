package com.example.pokeapp;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.pokeapp.models.AbilitiesItem;
import com.example.pokeapp.models.DetailPokemonResponse;
import com.example.pokeapp.network.ApiService;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetailActivity extends AppCompatActivity {
    public static final String TAG = DetailActivity.class.getSimpleName();
    private Retrofit retrofit;

    TextView pokemonName,pokexp, abilities;
    ImageView pokemonImageView, sprite1, sprite2;
    String concatAbility = "";
    ConstraintLayout cardBackground;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        pokemonName = findViewById(R.id.pokemonName);
        pokexp = findViewById(R.id.pokexp);
        abilities = findViewById(R.id.abilities);
        pokemonImageView = findViewById(R.id.pokemonImageView);
        sprite1 = findViewById(R.id.sprite1);
        sprite2 = findViewById(R.id.sprite2);
        cardBackground = findViewById(R.id.cardBackground);

        String id = getIntent().getStringExtra("EXTRA_POKEMON_ID");
        int number = getIntent().getIntExtra("EXTRA_POKEMON_NUMBER", 0);
        int mbackgroundColor = getIntent().getIntExtra("EXTRA_POKEMON_COLOR", 0);

        cardBackground.setBackgroundColor(mbackgroundColor);

        getdata(id, number);
    }

    private void getdata(String id, int number) {
        ApiService service = retrofit.create(ApiService.class);
        Call<DetailPokemonResponse> call = service.getPokemonById(id);

        call.enqueue(new Callback<DetailPokemonResponse>() {
            @Override
            public void onResponse(Call<DetailPokemonResponse> call, Response<DetailPokemonResponse> response) {
//                Log.e(TAG, "onResponse: " + response.body().getSprites().getBackDefault());
//                Log.e(TAG, "onResponse: " + response.body().getSprites().getFrontDefault());
                String mSprite1 = response.body().getSprites().getBackDefault();
                String mSprite2 = response.body().getSprites().getFrontDefault();
                String name = response.body().getName();
                String xp = String.valueOf(response.body().getBaseExperience());
                List<AbilitiesItem> mAbilities = response.body().getAbilities();

                Glide.with(DetailActivity.this)
                        .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/" + number + ".png")
                        .centerCrop()
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(pokemonImageView);

                pokemonName.setText(name);
                pokexp.setText("XP Base: " + xp);
                for (int i = 0; i < mAbilities.size(); i++) {
                    String ability = mAbilities.get(i).getAbility().getName();

                    if (i < mAbilities.size() - 1){
                        concatAbility += ability + ", ";
                        Log.i(TAG, "onResponse: abilities: 2 " + concatAbility);
                    }
                    else {
                        concatAbility += ability;
                        abilities.setText(concatAbility);
                    }
                }

                Glide.with(DetailActivity.this)
                        .load(mSprite1)
                        .centerCrop()
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(sprite1);

                Glide.with(DetailActivity.this)
                        .load(mSprite2)
                        .centerCrop()
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(sprite2);
            }

            @Override
            public void onFailure(Call<DetailPokemonResponse> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage() );
            }
        });
    }
}
