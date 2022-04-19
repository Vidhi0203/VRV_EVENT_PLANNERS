package com.example.vrveventplanners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class festivaltheme extends AppCompatActivity {
    ImageButton fes1,fes2,fes3,fes4,fes5,fes6;

    String Wedding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festivaltheme);
        fes1 = findViewById(R.id.fes1);
        fes2 = findViewById(R.id.fes2);
        fes3 = findViewById(R.id.fes3);
        fes4 = findViewById(R.id.fes4);
        fes5 = findViewById(R.id.fes5);
        fes6 = findViewById(R.id.fes6);

        Intent i = getIntent();
        Wedding = i.getStringExtra("Wedding");

        fes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        fes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        fes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        fes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        fes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        fes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
    }
    public void opendestination() {
        Intent intent = new Intent(festivaltheme.this, destination.class);
        String bday = "festivaltheme";
        intent.putExtra("Wedding",Wedding);
        intent.putExtra("wedTheme",bday);
        startActivity(intent);
    }
}