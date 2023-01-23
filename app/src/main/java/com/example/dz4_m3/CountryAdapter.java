package com.example.dz4_m3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.example.dz4_m3.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter  extends RecyclerView.Adapter<CountryViewHolder> {
    private ArrayList<Country> countries;
    private onItemClick onItemClick;

    public CountryAdapter(ArrayList<Country> countries) {
        this.countries = countries;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }
}

class CountryViewHolder extends RecyclerView.ViewHolder {
    private ItemCountryBinding binding;

    public CountryViewHolder( ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;

    }
    public void bind(Country country){

      binding.tvCountry.setText(country.getName());
      binding.countryTv.setText(country.getCapital());
        Glide.with(binding.imageView).load(country.getFlag()).into(binding.imageView);
    }



}