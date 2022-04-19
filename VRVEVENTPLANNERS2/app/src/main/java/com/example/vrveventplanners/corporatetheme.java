package com.example.vrveventplanners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class corporatetheme extends AppCompatActivity {
    ImageButton cop1,cop2,cop3,cop4,cop5,cop6;

    String Wedding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corporatetheme);
        cop1 = findViewById(R.id.cop1);
        cop2 = findViewById(R.id.cop2);
        cop3 = findViewById(R.id.cop3);
        cop4 = findViewById(R.id.cop4);
        cop5 = findViewById(R.id.cop5);
        cop6 = findViewById(R.id.cop6);

        Intent i = getIntent();
        Wedding = i.getStringExtra("Wedding");

        cop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        cop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        cop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        cop4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        cop5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
        cop6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
    }
    public void opendestination() {
        Intent intent = new Intent(corporatetheme.this, destination.class);
        String bday = "corporatetheme";
        intent.putExtra("Wedding",Wedding);
        intent.putExtra("wedTheme",bday);
        startActivity(intent);
    }

}