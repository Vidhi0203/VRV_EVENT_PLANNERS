package com.example.vrveventplanners;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.os.Bundle;

public class birthdaytheme extends AppCompatActivity {
    ImageButton bday1, bday2, bday3, bday4, bday5, bday6;

    String Wedding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthdaytheme);
        bday1 = findViewById(R.id.bday1);
        bday2 = findViewById(R.id.bday2);
        bday3 = findViewById(R.id.bday3);
        bday4 = findViewById(R.id.bday4);
        bday5 = findViewById(R.id.bday5);
        bday6 = findViewById(R.id.bday6);

        Intent i = getIntent();
        Wedding = i.getStringExtra("Wedding");

        bday1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        bday2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        bday3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        bday4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        bday5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        bday6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
    }

    public void opendestination() {
        Intent intent = new Intent(birthdaytheme.this, destination.class);
        String bday = "bday";
        intent.putExtra("Wedding",Wedding);
        intent.putExtra("wedTheme",bday);
        startActivity(intent);
    }
}