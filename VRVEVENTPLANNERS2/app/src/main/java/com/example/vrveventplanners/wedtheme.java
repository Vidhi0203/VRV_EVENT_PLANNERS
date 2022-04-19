package com.example.vrveventplanners;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class wedtheme extends AppCompatActivity {
    ImageButton wed1,wed2,wed3,wed4,wed5,wed6;
    String Wedding;
    String Indoor;

//    Button Back,Skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wedtheme);
        wed1 = findViewById(R.id.wed1);
        wed2 = findViewById(R.id.wed2);
        wed3 = findViewById(R.id.wed3);
        wed4 = findViewById(R.id.wed4);
        wed5 = findViewById(R.id.wed5);
        wed6 = findViewById(R.id.wed6);
//        Back = findViewById(R.id.Back);
//        Skip = findViewById(R.id.Skip);

        Intent i = getIntent();
        Wedding = i.getStringExtra("Wedding");
        Indoor = i.getStringExtra("Indoor");

//        Skip.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(wedtheme.this, weddingfunctions.class);
//                startActivity(intent);
//            }
//        });
        wed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(wedtheme.this, weddingfunctions.class);
                String wed1Theme = "wed1Theme";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",wed1Theme);
                startActivity(intent);

            }
        });
        wed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(wedtheme.this, weddingfunctions.class);
                String wed2Theme = "wed2Theme";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",wed2Theme);
                startActivity(intent);

            }
        });
        wed3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(wedtheme.this, weddingfunctions.class);
                String wed3Theme = "wed3Theme";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",wed3Theme);
                startActivity(intent);

            }
        });
        wed4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(wedtheme.this, weddingfunctions.class);
                String wed4Theme = "wed4Theme";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",wed4Theme);
                startActivity(intent);

            }
        });
        wed5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(wedtheme.this, weddingfunctions.class);
                String wed5Theme = "wed5Theme";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",wed5Theme);
                startActivity(intent);

            }
        });
        wed6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(wedtheme.this, weddingfunctions.class);
                String wed6Theme = "wed6Theme";
                intent.putExtra("Indoor",Indoor);
                intent.putExtra("Wedding",Wedding);
                intent.putExtra("wedTheme",wed6Theme);
                startActivity(intent);

            }
        });
    }
}