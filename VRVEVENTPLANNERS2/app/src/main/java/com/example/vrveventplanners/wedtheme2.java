package com.example.vrveventplanners;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class wedtheme2 extends AppCompatActivity {
    ImageButton wed1,wed2,wed3,wed4,wed5,wed6;
    String Wedding;
    String outdoor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wedtheme2);
        wed1 = findViewById(R.id.wed1);
        wed2 = findViewById(R.id.wed2);
        wed3 = findViewById(R.id.wed3);
        wed4 = findViewById(R.id.wed4);
        wed5 = findViewById(R.id.wed5);
        wed6 = findViewById(R.id.wed6);

        Intent i = getIntent();
        Wedding = i.getStringExtra("Wedding");
        outdoor = i.getStringExtra("Indoor");

        wed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openweddingfunctions();

            }
        });
        wed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openweddingfunctions();

            }
        });
        wed3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openweddingfunctions();

            }
        });
        wed4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openweddingfunctions();

            }
        });
        wed5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openweddingfunctions();

            }
        });
        wed6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openweddingfunctions();

            }
        });
    }
    public void openweddingfunctions() {
        Intent intent = new Intent(wedtheme2.this, weddingfunctions.class);
        String wedtheme = "wedtheme2";
        intent.putExtra("Indoor",outdoor);
        intent.putExtra("Wedding",Wedding);
        intent.putExtra("wedtheme",wedtheme);
        startActivity(intent);
    }
}