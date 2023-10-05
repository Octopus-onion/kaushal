package com.example.thesilentwords;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.os.Handler;

public class ss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss);
        new Handler().postDelayed(() -> {
        },2000);
    }
}
