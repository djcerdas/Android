package com.djcerdas.pokedextico.adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.djcerdas.pokedextico.fragment.MenuPokedex;
import com.djcerdas.pokedextico.fragment.MenuPokedexArgs;
import com.djcerdas.pokedextico.fragment.NullDisplayFragment;
import com.djcerdas.pokedextico.fragment.PokemonTrainerInfo;
import com.djcerdas.pokedextico.fragment.RecycleViewFragment;

public class PokemonViewPage2Adapter extends FragmentStateAdapter {

    public PokemonViewPage2Adapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment showFragment;
        Bundle bundle = new Bundle();
        switch (position) {
            case 0:
                showFragment = new RecycleViewFragment();
                break;
            case 1:
                showFragment = new NullDisplayFragment();
                break;
            case 2:
                bundle.putString("trainerName", String.valueOf("DJCerdas"));
                bundle.putInt("trainerLevel", 500);
                showFragment = new PokemonTrainerInfo();
                break;
            default:
                showFragment = new NullDisplayFragment();
        }
        showFragment.setArguments(bundle);
        return showFragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }


}
