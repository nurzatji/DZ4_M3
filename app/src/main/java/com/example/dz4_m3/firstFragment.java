package com.example.dz4_m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dz4_m3.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class firstFragment extends Fragment implements onItemClick {
private FragmentFirstBinding binding;
private ArrayList<Continent>continentList;
private  ContinentAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter  = new ContinentAdapter(continentList,this);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        continentList = new ArrayList<>();
        continentList.add(new Continent("North America"));
        continentList.add(new Continent("Australia"));
        continentList.add(new Continent("Eurasia"));
        continentList.add(new Continent("South America"));
        continentList.add(new Continent("Africa"));
    }


    @Override
    public void onClick(Integer position) {
        Bundle bundle = new Bundle();
        bundle.putInt("key", position);

        SecondFragment secondFragment= new SecondFragment();
        secondFragment.setArguments(bundle);

        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,secondFragment).addToBackStack(null).commit();


    }

    }
