package com.example.pokeapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.pokeapp.DetailActivity;
import com.example.pokeapp.MainActivity;
import com.example.pokeapp.R;
import com.example.pokeapp.models.DetailPokemonResponse;
import com.example.pokeapp.models.Pokemon;
import com.example.pokeapp.network.ApiService;
import com.example.pokeapp.utils.Utils;

import java.util.ArrayList;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PokemonListAdapter extends RecyclerView.Adapter<PokemonListAdapter.ViewHolder>{
    public static final String TAG = PokemonListAdapter.class.getSimpleName();

    private ArrayList<Pokemon> data;
    private Context context;

    int color = 0;
    Random rnd = new Random();
    public ArrayList<Integer> colors = new ArrayList<>();

    public PokemonListAdapter(Context context) {
        this.context = context;
        data = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pokemon_item, parent, false);


        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_item);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PokemonListAdapter.ViewHolder holder, int position) {
        Pokemon p = data.get(position);
        holder.pokemonNameTextView.setText(p.getName());

            color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            colors.add(color);

        holder.pokemonCardView.setBackgroundColor(colors.get(position));

        Glide.with(context)
            .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/" + p.getNumber() + ".png")
            .centerCrop()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(holder.pokemonImageView);

        holder.pokemonCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //int pokemonId = p.getNumber();
                String pokemonId = p.getName();
                //Log.i(TAG, "onClick pokemon id: " + pokemonId);

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("EXTRA_POKEMON_ID", pokemonId);
                intent.putExtra("EXTRA_POKEMON_NUMBER", p.getNumber());
                intent.putExtra("EXTRA_POKEMON_COLOR", colors.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void addPokemon(ArrayList<Pokemon> pokemonArrayList) {
        data.addAll(pokemonArrayList);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView pokemonImageView;
        private TextView pokemonNameTextView;
        private CardView pokemonCardView;

        public ViewHolder(View itemView) {
            super(itemView);

            pokemonImageView = (ImageView) itemView.findViewById(R.id.pokemonImageView);
            pokemonNameTextView = (TextView) itemView.findViewById(R.id.pokemonName);
            pokemonCardView = (CardView) itemView.findViewById(R.id.pokemonCardView);


        }
    }

}
