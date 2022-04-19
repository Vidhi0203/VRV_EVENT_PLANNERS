package com.example.vrveventplanners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class haldi extends AppCompatActivity {
    ImageButton hld1,hld2,hld3,hld4;
    Button Back,Skip;

    String Wedding;
    String Indoor;
    String Theme;
    String ckParty;
    String ckPartyfunction;
    String mhdfunction;
    String mhd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haldi);
        hld1 = findViewById(R.id.hld1);
        hld2 = findViewById(R.id.hld2);
        hld3 = findViewById(R.id.hld3);
        hld4 = findViewById(R.id.hld4);
        Back = findViewById(R.id.Back);
        Skip = findViewById(R.id.Skip);

        Intent i = getIntent();
        Wedding = i.getStringExtra("Wedding");
        Indoor = i.getStringExtra("Indoor");
        Theme = i.getStringExtra("wedTheme");
        ckParty = i.getStringExtra("ckParty");
        ckPartyfunction = i.getStringExtra("ckParty function");
        mhdfunction = i.getStringExtra("mhd function");
        mhd = i.getStringExtra("mhd");

        hld1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(haldi.this, Wfm3.class);
                String hld1 = "hld1";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("ckParty function",ckPartyfunction);
                intent.putExtra("mhd function",mhdfunction);
                intent.putExtra("mhd",mhd);
                intent.putExtra("hld",hld1);
                startActivity(intent);

            }
        });

        hld2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(haldi.this, Wfm3.class);
                String hld2 = "hld2";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("ckParty function",ckPartyfunction);
                intent.putExtra("mhd function",mhdfunction);
                intent.putExtra("mhd",mhd);
                intent.putExtra("hld",hld2);
                startActivity(intent);

            }
        });

        hld3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(haldi.this, Wfm3.class);
                String hld3 = "hld3";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("ckParty function",ckPartyfunction);
                intent.putExtra("mhd function",mhdfunction);
                intent.putExtra("mhd",mhd);
                intent.putExtra("hld",hld3);
                startActivity(intent);

            }
        });

        hld4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(haldi.this, Wfm3.class);
                String hld4 = "hld4";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("ckParty function",ckPartyfunction);
                intent.putExtra("mhd function",mhdfunction);
                intent.putExtra("mhd",mhd);
                intent.putExtra("hld",hld4);
                startActivity(intent);

            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhaldi();

            }
        });

        Skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensangeet();

            }
        });
    }
    public void openhaldi() {
        Intent intent = new Intent(haldi.this, mehndi.class);
        intent.putExtra("Indoor",Indoor);
        intent.putExtra("Wedding",Wedding);
        intent.putExtra("wedTheme",Theme);
        intent.putExtra("ckParty",ckParty);
        intent.putExtra("ckParty function",ckPartyfunction);
        startActivity(intent);
    }

    public void opensangeet() {
        Intent intent = new Intent(haldi.this, sangeet.class);
        intent.putExtra("Indoor",Indoor);
        intent.putExtra("Wedding",Wedding);
        intent.putExtra("wedTheme",Theme);
        intent.putExtra("ckParty",ckParty);
        intent.putExtra("ckParty function",ckPartyfunction);
        intent.putExtra("mhd",mhd);
        startActivity(intent);
    }
}