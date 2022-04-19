package com.example.vrveventplanners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Reception extends AppCompatActivity {
    ImageButton recp1,recp2,recp3,recp4;
    Button Back,Skip;

    String Wedding;
    String Indoor;
    String Theme;
    String ckParty;
    String mhd;
    String hld;
    String sing;
    String ckPartyfunction;
    String mhdfunction;
    String hldfunction;
    String singfunction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reception);
        recp1 = findViewById(R.id.recp1);
        recp2 = findViewById(R.id.recp2);
        recp3 = findViewById(R.id.recp3);
        recp4 = findViewById(R.id.recp4);
        Back = findViewById(R.id.Back);
        Skip = findViewById(R.id.Skip);

        Intent i = getIntent();
        Wedding = i.getStringExtra("Wedding");
        Indoor = i.getStringExtra("Indoor");
        Theme = i.getStringExtra("wedTheme");
        ckParty = i.getStringExtra("ckParty");
        ckPartyfunction = i.getStringExtra("ckParty function");
        mhdfunction = i.getStringExtra("mhd function");
        hldfunction = i.getStringExtra("hld function");
        singfunction = i.getStringExtra("sing function");
        mhd = i.getStringExtra("mhd");
        hld = i.getStringExtra("hld");
        sing = i.getStringExtra("sing");

        recp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reception.this, DestinationActivity2.class);
                String recp1 = "recp1";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("mhd",mhd);
                intent.putExtra("hld",hld);
                intent.putExtra("sing",sing);
                intent.putExtra("ckParty function",ckPartyfunction);
                intent.putExtra("mhd function",mhdfunction);
                intent.putExtra("hld function",hldfunction);
                intent.putExtra("sing function",singfunction);
                intent.putExtra("recp",recp1);
                startActivity(intent);

            }
        });

        recp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reception.this, DestinationActivity2.class);
                String recp1 = "recp2";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("ckParty function",ckPartyfunction);
                intent.putExtra("mhd function",mhdfunction);
                intent.putExtra("hld function",hldfunction);
                intent.putExtra("mhd",mhd);
                intent.putExtra("hld",hld);
                intent.putExtra("sing",sing);
                intent.putExtra("sing function",singfunction);
                intent.putExtra("recp",recp1);
                startActivity(intent);

            }
        });

        recp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reception.this, DestinationActivity2.class);
                String recp1 = "recp3";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("ckParty function",ckPartyfunction);
                intent.putExtra("mhd function",mhdfunction);
                intent.putExtra("hld function",hldfunction);
                intent.putExtra("mhd",mhd);
                intent.putExtra("hld",hld);
                intent.putExtra("sing",sing);
                intent.putExtra("sing function",singfunction);
                intent.putExtra("recp",recp1);
                startActivity(intent);

            }
        });

        recp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reception.this, DestinationActivity2.class);
                String recp1 = "recp4";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("ckParty function",ckPartyfunction);
                intent.putExtra("mhd function",mhdfunction);
                intent.putExtra("hld function",hldfunction);
                intent.putExtra("mhd",mhd);
                intent.putExtra("hld",hld);
                intent.putExtra("sing",sing);
                intent.putExtra("sing function",singfunction);
                intent.putExtra("recp",recp1);
                startActivity(intent);

            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensangeet();

            }
        });

        Skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendestination();

            }
        });
    }
    public void opendestination() {
        Intent intent = new Intent(Reception.this, DestinationActivity2.class);
        intent.putExtra("Indoor",Indoor);
        intent.putExtra("Wedding",Wedding);
        intent.putExtra("wedTheme",Theme);
        intent.putExtra("ckParty",ckParty);
        intent.putExtra("ckParty function",ckPartyfunction);
        intent.putExtra("mhd function",mhdfunction);
        intent.putExtra("hld function",hldfunction);
        intent.putExtra("mhd",mhd);
        intent.putExtra("hld",hld);
        intent.putExtra("sing",sing);
        intent.putExtra("sing function",singfunction);
        startActivity(intent);
    }

    public void opensangeet() {
        Intent intent = new Intent(Reception.this, sangeet.class);
        intent.putExtra("Indoor",Indoor);
        intent.putExtra("Wedding",Wedding);
        intent.putExtra("wedTheme",Theme);
        intent.putExtra("ckParty",ckParty);
        intent.putExtra("ckParty function",ckPartyfunction);
        intent.putExtra("mhd function",mhdfunction);
        intent.putExtra("hld function",hldfunction);
        intent.putExtra("mhd",mhd);
        intent.putExtra("hld",hld);
        startActivity(intent);
    }
}