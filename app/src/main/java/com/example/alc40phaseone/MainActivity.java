package com.example.alc40phaseone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //TODO: define var. for buttons
    Button btnabout,btnmyprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnabout = findViewById(R.id.btnabout);
        btnmyprofile = findViewById(R.id.btnmyprofile);

        //TODO: set on click listener for the buttons
        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO: open activity B (About ALC)

                Intent aboutintent = new Intent(MainActivity.this,About_ALC.class);
                startActivity(aboutintent);

            }
        });
        btnmyprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: open activity C (My profile)

                Intent profileintent = new Intent(MainActivity.this,My_Profile.class);
                startActivity(profileintent);

            }
        });
    }
}
