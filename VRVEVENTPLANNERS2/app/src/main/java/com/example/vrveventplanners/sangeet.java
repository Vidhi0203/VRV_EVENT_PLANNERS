package com.example.vrveventplanners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class sangeet extends AppCompatActivity {
    private Bundle savedInstanceState;
    ImageButton sing1,sing2,sing3,sing4;
    Button Back,Skip;

    String Wedding;
    String Indoor;
    String Theme;
    String ckParty;
    String ckPartyfunction;
    String mhdfunction;
    String hldfunction;
    String mhd;
    String hld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sangeet);

        sing1 = findViewById(R.id.sing1);
        sing2 = findViewById(R.id.sing2);
        sing3 = findViewById(R.id.sing3);
        sing4 = findViewById(R.id.sing4);
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
        mhd = i.getStringExtra("mhd");
        hld = i.getStringExtra("hld");

        sing1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sangeet.this, Wfm4.class);
                String sing1 = "sing1";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("ckParty function",ckPartyfunction);
                intent.putExtra("mhd function",mhdfunction);
                intent.putExtra("hld function",hldfunction);
                intent.putExtra("mhd",mhd);
                intent.putExtra("hld",hld);
                intent.putExtra("sing",sing1);
                startActivity(intent);

            }
        });

        sing2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sangeet.this, Wfm4.class);
                String sing2 = "sing2";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("ckParty function",ckPartyfunction);
                intent.putExtra("mhd function",mhdfunction);
                intent.putExtra("hld function",hldfunction);
                intent.putExtra("mhd",mhd);
                intent.putExtra("hld",hld);
                intent.putExtra("sing",sing2);
                startActivity(intent);

            }
        });

        sing3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sangeet.this, Wfm4.class);
                String sing3 = "sing3";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("ckParty function",ckPartyfunction);
                intent.putExtra("mhd function",mhdfunction);
                intent.putExtra("hld function",hldfunction);
                intent.putExtra("mhd",mhd);
                intent.putExtra("hld",hld);
                intent.putExtra("sing",sing3);
                startActivity(intent);

            }
        });

        sing4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sangeet.this, Wfm4.class);
                String sing4 = "sing4";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",Theme);
                intent.putExtra("ckParty",ckParty);
                intent.putExtra("ckParty function",ckPartyfunction);
                intent.putExtra("mhd function",mhdfunction);
                intent.putExtra("hld function",hldfunction);
                intent.putExtra("mhd",mhd);
                intent.putExtra("hld",hld);
                intent.putExtra("sing",sing4);
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
                openReception();

            }
        });
    }
    public void openhaldi() {
        Intent intent = new Intent(sangeet.this, haldi.class);
        intent.putExtra("Indoor",Indoor);
        intent.putExtra("Wedding",Wedding);
        intent.putExtra("wedTheme",Theme);
        intent.putExtra("ckParty",ckParty);
        intent.putExtra("ckParty function",ckPartyfunction);
        intent.putExtra("mhd function",mhdfunction);
        intent.putExtra("mhd",mhd);
        startActivity(intent);
    }

    public void openReception() {
        Intent intent = new Intent(sangeet.this, Reception.class);
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