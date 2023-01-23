package com.example.dz4_m3;

import android.nfc.tech.NfcA;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dz4_m3.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
private FragmentSecondBinding binding;

 private ArrayList<Country>countyList;
 private  CountryAdapter adapter;

 private  Integer position;
    private ArrayList<Country> countries;

    public SecondFragment() {
        this.adapter = adapter;
    }

    public SecondFragment(int contentLayoutId, CountryAdapter adapter) {
        super(contentLayoutId);
        this.adapter = adapter;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");

        checkPosition(position);
        adapter = new CountryAdapter(countries);
        binding.recyclerView.setAdapter(adapter);
    }

    private void checkPosition(Integer position) {
        if (position == 0) {
            loadNorthAmerica();
        } else if (position == 1) {
            loadSouthAmerica();
        } else if (position == 2) {
            loadEurasia();
        } else if (position == 3) {
            loadAfrica();
        } else if (position == 4) {
            loadAustralia();


        }

    }

    private void loadNorthAmerica() {
        countries = new ArrayList<>();
        countries.add(new Country("United States of America","Washington","https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/2560px-Flag_of_the_United_States.svg.png"));
        countries.add(new Country("Mexico","Mexico","https://upload.wikimedia.org/wikipedia/commons/1/17/Flag_of_Mexico.png"));
        countries.add(new Country("Canada","Ottawa","https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Canada.png"));
        countries.add(new Country("Cuba","Havana","https://upload.wikimedia.org/wikipedia/commons/9/92/Flag_of_Cuba.png"));
        countries.add(new Country("Greenland","Nuuk","https://upload.wikimedia.org/wikipedia/commons/7/72/Flag_of_Greenland.png"));
    }

    private void loadAustralia() {
        countries = new ArrayList<>();
        countries.add(new Country("Australia","Canberra","https://upload.wikimedia.org/wikipedia/en/thumb/b/b9/Flag_of_Australia.svg/1280px-Flag_of_Australia.svg.png"));
        countries.add(new Country("Papua New Guinea","Port-Moresby","https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Flag_of_Papua_New_Guinea.svg/640px-Flag_of_Papua_New_Guinea.svg.png"));
        countries.add(new Country("New Zealand","Wellington","https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Flag_of_New_Zealand.svg/2560px-Flag_of_New_Zealand.svg.png"));
        countries.add(new Country("Fiji","Suva","https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Fiji.svg/2560px-Flag_of_Fiji.svg.png"));
        countries.add(new Country("Solomon Islands","Honiara","https://upload.wikimedia.org/wikipedia/commons/7/7d/Solomon_islands_flag.png"));
    }

    private void loadEurasia() {
        countries = new ArrayList<>();
        countries.add(new Country("France","Paris","https://upload.wikimedia.org/wikipedia/commons/6/62/Flag_of_France.png"));
        countries.add(new Country("Spain","Madrid","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flag_of_Spain.svg/2560px-Flag_of_Spain.svg.png"));
        countries.add(new Country("Azerbaijan","Baku","https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Flag_of_Azerbaijan_Democtratic_Republic.PNG/800px-Flag_of_Azerbaijan_Democtratic_Republic.PNG"));
        countries.add(new Country("Ukraine","Kiev","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Flag_of_Ukraine.png/640px-Flag_of_Ukraine.png"));
        countries.add(new Country("Kyrgyzstan","Bishkek","https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Kyrgyzstan.png/1200px-Flag_of_Kyrgyzstan.png"));
    }

    private void loadSouthAmerica() {
        countries = new ArrayList<>();
        countries.add(new Country("Brazil","Brasilia","https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/2560px-Flag_of_Brazil.svg.png"));
        countries.add(new Country("Argentina","Buenos-Aires","https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/2560px-Flag_of_Argentina.svg.png"));
        countries.add(new Country("Peru","Lima","https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/1280px-Flag_of_Peru_%28state%29.svg.png"));
        countries.add(new Country("Colombia","Bogota","https://upload.wikimedia.org/wikipedia/commons/f/f8/Flag_of_Colombia.png"));
        countries.add(new Country("Chile","Santiago","https://upload.wikimedia.org/wikipedia/commons/a/ae/Flag_of_Chile.png"));
    }

    private void loadAfrica() {

        countries.add(new Country("Tunisia", "Tunis", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Flag_of_Tunisia.svg/2560px-Flag_of_Tunisia.svg.png"));
        countries.add(new Country("Nigeria", "Abuja", "https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Nigeria.png"));
        countries.add(new Country("Morocco", "Rabat", "https://upload.wikimedia.org/wikipedia/commons/f/f6/Flag_of_MoroccoFlag_of_Morocco.png"));
        countries.add(new Country("Senegal", "Dakar", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Flag_of_Senegal.svg/1280px-Flag_of_Senegal.svg.png"));
        countries.add(new Country("Algeria", "Algiers", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Flag_of_Algeria.svg/2560px-Flag_of_Algeria.svg.png"));
    }

//      ///  private void loadNorthAmerica() {
//            countries = new ArrayList<>();
//            countries.add(new Country("United States of America","Washington","https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/2560px-Flag_of_the_United_States.svg.png"));
//            countries.add(new Country("Mexico","Mexico","https://upload.wikimedia.org/wikipedia/commons/1/17/Flag_of_Mexico.png"));
//            countries.add(new Country("Canada","Ottawa","https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Canada.png"));
//            countries.add(new Country("Cuba","Havana","https://upload.wikimedia.org/wikipedia/commons/9/92/Flag_of_Cuba.png"));
//            countries.add(new Country("Greenland","Nuuk","https://upload.wikimedia.org/wikipedia/commons/7/72/Flag_of_Greenland.png"));
//        }
//
//    }
    }


//    Сделать 2 фрагмента .
//            Сначала показывать в первом фрагменты все континенты. При нажатии на континент нужно открыть втором фрагменте и там должно отобразиться 5 стран из того континента на который вы нажали.
//            Дэдлайн до урока.
//            Картинки можно брать с фигмы