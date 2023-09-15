package ru.mirea.kiushkinaaa.lesson4;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.mirea.kiushkinaaa.lesson4.databinding.FragmentPlayerBinding;

public class PlayerFragment extends Fragment {

    private  FragmentPlayerBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentPlayerBinding.inflate(getLayoutInflater());
        Log.d(PlayerFragment.class.getSimpleName(), "Orientation: " +getActivity().getResources().getConfiguration().orientation );
//        if (getActivity().getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
//            return inflater.inflate(R.layout.fragment_player_land, container, false);
//        }else{
//            return inflater.inflate(R.layout.fragment_player, container, false);
//        }



//        return inflater.inflate(R.layout.fragment_player, container, false);
        return binding.getRoot();
    }


}