package com.example.vrveventplanners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class partytheme extends AppCompatActivity {
    ImageButton party1,party2,party3,party4,party5,party6;

    String Wedding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partytheme);
        party1 = findViewById(R.id.party1);
        party2 = findViewById(R.id.party2);
        party3 = findViewById(R.id.party3);
        party4 = findViewById(R.id.party4);
        party5 = findViewById(R.id.party5);
        party6 = findViewById(R.id.party6);

        Intent i = getIntent();
        Wedding = i.getStringExtra("Wedding");

        party1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });

        party2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });

        party3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });

        party4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        party5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }

        });party6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
    }
    public void opendestination() {
        Intent intent = new Intent(partytheme.this, destination.class);
        String bday = "partytheme";
        intent.putExtra("Wedding",Wedding);
        intent.putExtra("wedTheme",bday);
        startActivity(intent);
    }
}