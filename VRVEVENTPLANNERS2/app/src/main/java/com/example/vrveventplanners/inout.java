package com.example.vrveventplanners;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class inout extends AppCompatActivity {
    Button indoor, outdoor;
    String Wedding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inout);
        indoor = findViewById(R.id.indoor);
        outdoor = findViewById(R.id.outdoor);

        Intent i = getIntent();
        Wedding = i.getStringExtra("Wedding");
//        Log.e("Wedding",Wedding);

        indoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwedtheme();
            }
        });

        outdoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwedtheme2();
            }
        });
    }
    public void openwedtheme() {
        Intent intent = new Intent(inout.this, wedtheme.class);
        String Indoor = "Indoor";
        intent.putExtra("Indoor",Indoor);
        intent.putExtra("Wedding",Wedding);
        startActivity(intent);
    }
    public void openwedtheme2() {
        Intent intent = new Intent(inout.this, wedtheme2.class);
        String Outdoor = "Outdoor";
        intent.putExtra("Indoor",Outdoor);
        intent.putExtra("Wedding",Wedding);
        startActivity(intent);
    }
}