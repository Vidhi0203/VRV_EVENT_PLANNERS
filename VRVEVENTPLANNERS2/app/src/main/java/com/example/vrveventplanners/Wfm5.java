package com.example.vrveventplanners;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Wfm5 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup radioGroup;
    Button btn_result;
    String function;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wfm5);

        radioGroup = (RadioGroup) findViewById(R.id.indoor_outdoor);
        btn_result = (Button) findViewById(R.id.btn);

        radioGroup.setOnCheckedChangeListener(this);

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Wfm5.this, function, Toast.LENGTH_SHORT).show();
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