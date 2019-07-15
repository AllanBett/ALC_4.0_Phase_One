package com.example.alc40phaseone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class My_Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        //TODO: set back button on the toolbar
        getSupportActionBar().setTitle("My Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
