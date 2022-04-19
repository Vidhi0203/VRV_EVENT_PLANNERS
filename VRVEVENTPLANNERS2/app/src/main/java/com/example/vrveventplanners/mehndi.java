package com.example.vrveventplanners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class mehndi extends AppCompatActivity {
    ImageButton mhd1,mhd2,mhd3,mhd4;
    Button Back,Skip;

    String Wedding;
    String Indoor;
    String Theme;
    String ckParty;
    String function;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mehndi);
        mhd1 = findViewById(R.id.mhd1);
        mhd2 = findViewById(R.id.mhd2);
        mhd3 = findViewById(R.id.mhd3);
        mhd4 = findViewById(R.id.mhd4);
        Back = findViewById(R.id.Back);
        Skip = findViewById(R.id.Skip);

        Intent i = getIntent();
        Wedding = i.getStringExtra("Wedding");
        Indoor = i.getStringExtra("Indoor");
        Theme = i.getStringExtra("wedTheme");
        ckParty = i.getStringExtra("ckParty");
        function = i.getStringExtra("ckParty function");

        mhd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mehndi.this, Wfm2.class);
                String mhd1 = "mhd1";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("ckParty function",function);
                intent.putExtra("mhd",mhd1);
                startActivity(intent);

            }
        });

        mhd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mehndi.this, Wfm2.class);
                String mhd2 = "mhd2";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("ckParty function",function);
                intent.putExtra("mhd",mhd2);
                startActivity(intent);

            }
        });

        mhd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mehndi.this, Wfm2.class);
                String mhd3 = "mhd3";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("ckParty function",function);
                intent.putExtra("mhd",mhd3);
                startActivity(intent);

            }
        });

        mhd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mehndi.this, Wfm2.class);
                String mhd4 = "mhd4";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("ckParty function",function);
                intent.putExtra("mhd",mhd4);
                startActivity(intent);

            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openweddingfunctions();

            }
        });

        Skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhaldi();

            }
        });
    }
    public void openweddingfunctions() {
        Intent intent = new Intent(mehndi.this, weddingfunctions.class);
        startActivity(intent);
    }

    public void openhaldi() {
        Intent intent = new Intent(mehndi.this, haldi.class);
        intent.putExtra("Indoor",Indoor);
        intent.putExtra("Wedding",Wedding);
        intent.putExtra("wedTheme",Theme);
        intent.putExtra("ckParty",ckParty);
        intent.putExtra("ckParty function",function);
        startActivity(intent);
    }
}