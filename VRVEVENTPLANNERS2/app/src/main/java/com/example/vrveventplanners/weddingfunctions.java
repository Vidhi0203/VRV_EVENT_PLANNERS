package com.example.vrveventplanners;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class weddingfunctions extends AppCompatActivity {
    private Bundle savedInstanceState;
    ImageButton ck1,ck2,ck3,ck4;
    Button Back,Skip;
    String Wedding;
    String Indoor;
    String Theme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weddingfunctions);

        ck1 = findViewById(R.id.ck1);
        ck2 = findViewById(R.id.ck2);
        ck3 = findViewById(R.id.ck3);
        ck4 = findViewById(R.id.ck4);
        Back = findViewById(R.id.Back);
        Skip = findViewById(R.id.Skip);

        Intent i = getIntent();
        Wedding = i.getStringExtra("Wedding");
        Indoor = i.getStringExtra("Indoor");
        Theme = i.getStringExtra("wedTheme");

        ck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(weddingfunctions.this, Wfm1.class);
                String ck1 = "ck1Party";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ck1);
                startActivity(intent);

            }
        });

        ck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(weddingfunctions.this, Wfm1.class);
                String ck2 = "ck2Party";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ck2);
                startActivity(intent);

            }
        });

        ck3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(weddingfunctions.this, Wfm1.class);
                String ck3 = "ck3Party";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ck3);
                startActivity(intent);

            }
        });

        ck4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(weddingfunctions.this, Wfm1.class);
                String ck4 = "ck4Party";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ck4);
                startActivity(intent);

            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinout();

            }
        });

        Skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmehndi();

            }
        });
    }

    public void openinout() {
        Intent intent = new Intent(weddingfunctions.this, inout.class);
        startActivity(intent);
    }

    public void openmehndi() {
        Intent intent = new Intent(weddingfunctions.this, Wfm1.class);
        intent.putExtra("Indoor",Indoor);
        intent.putExtra("Wedding",Wedding);
        intent.putExtra("wedTheme",Theme);
        startActivity(intent);
    }
}