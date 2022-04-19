package com.example.vrveventplanners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;


public class babytheme extends AppCompatActivity {
    ImageButton baby1,baby2,baby3,baby4,baby5,baby6;
    String Wedding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babytheme);
        baby1 = findViewById(R.id.baby1);
        baby2 = findViewById(R.id.baby2);
        baby3 = findViewById(R.id.baby3);
        baby4 = findViewById(R.id.baby4);
        baby5 = findViewById(R.id.baby5);
        baby6 = findViewById(R.id.baby6);

        Intent i = getIntent();
        Wedding = i.getStringExtra("Wedding");

        baby1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        baby2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        baby3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        baby4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        baby5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        baby6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
    }
    public void opendestination() {
        Intent intent = new Intent(babytheme.this, destination.class);
        String bday = "babytheme";
        intent.putExtra("Wedding",Wedding);
        intent.putExtra("wedTheme",bday);
        startActivity(intent);
    }
}