package com.example.dz4_m3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dz4_m3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());


        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container,new firstFragment()).commit();
        }
    }

}