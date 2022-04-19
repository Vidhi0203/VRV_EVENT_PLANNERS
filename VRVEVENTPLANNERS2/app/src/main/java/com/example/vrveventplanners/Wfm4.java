package com.example.vrveventplanners;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Wfm4 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup radioGroup;
    Button btn_result;
    String function = "Venue";
    String Wedding;
    String Indoor;
    String Theme;
    String ckParty;
    String ckPartyfunction;
    String mhdfunction;
    String hldfunction;
    String mhd;
    String hld;
    String sing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wfm4);

        radioGroup = (RadioGroup) findViewById(R.id.indoor_outdoor);
        btn_result = (Button) findViewById(R.id.btn);

        radioGroup.setOnCheckedChangeListener(this);
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
        sing = i.getStringExtra("sing");

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (function.equals("Venue")){
                    Toast.makeText(Wfm4.this, "Please select Venue", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(Wfm4.this, Reception.class);
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
                    intent.putExtra("sing function",function);
                    startActivity(intent);
                }
            }
        });

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

        switch (i){

            case R.id.hall:
                function="hall";
                break;

            case R.id.resort:
                function="Resort";
                break;

            case R.id.banquet:
                function="Banquet";
                break;

            case R.id.poolside:
                function="Poolside";
                break;

            case R.id.garden:
                function="Garden";
                break;

            case R.id.beachview:
                function="Beach View";
                break;

        }
    }
}