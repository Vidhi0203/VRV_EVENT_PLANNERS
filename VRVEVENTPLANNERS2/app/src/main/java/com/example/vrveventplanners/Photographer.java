package com.example.vrveventplanners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Photographer extends AppCompatActivity {
    ImageButton pic1,pic2,pic3,pic4;
    Button Back, Skip;

    String Wedding;
    String Indoor;
    String Theme;
    String ckParty;
    String function;
    String mhd;
    String hld;
    String sing;
    String recp;
    String editTextTextPersonNameStr;
    String Event;
    String editTextTextMultiLine2Str;
    String editText2Str;
    String pincodeStr;
    String caterer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photographer);
        pic1 = findViewById(R.id.pic1);
        pic2 = findViewById(R.id.pic2);
        pic3 = findViewById(R.id.pic3);
        pic4 = findViewById(R.id.pic4);
        Back = findViewById(R.id.Back);
        Skip = findViewById(R.id.Skip);

        Intent i = getIntent();
        Wedding = i.getStringExtra("Wedding");
        Indoor = i.getStringExtra("Indoor");
        Theme = i.getStringExtra("wedTheme");
        ckParty = i.getStringExtra("ckParty");
        function = i.getStringExtra("function");
        mhd = i.getStringExtra("mhd");
        hld = i.getStringExtra("hld");
        sing = i.getStringExtra("sing");
        recp = i.getStringExtra("recp");
        editTextTextPersonNameStr = i.getStringExtra("editTextTextPersonNameStr");
        Event = i.getStringExtra("Event");
        editTextTextMultiLine2Str = i.getStringExtra("editTextTextMultiLine2Str");
        editText2Str = i.getStringExtra("editText2Str");
        pincodeStr = i.getStringExtra("pincodeStr");
        caterer = i.getStringExtra("caterer");

        pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Photographer.this, dj.class);
                String Photographer = "Filmapia India";
                intent.putExtra("Indoor", Indoor);
                intent.putExtra("Wedding", Wedding);
                intent.putExtra("wedTheme", Theme);
                intent.putExtra("ckParty", ckParty);
                intent.putExtra("function", function);
                intent.putExtra("mhd", mhd);
                intent.putExtra("hld", hld);
                intent.putExtra("sing", sing);
                intent.putExtra("recp", recp);
                intent.putExtra("editTextTextPersonNameStr", editTextTextPersonNameStr);
                intent.putExtra("Event", Event);
                intent.putExtra("editTextTextMultiLine2Str", editTextTextMultiLine2Str);
                intent.putExtra("editText2Str", editText2Str);
                intent.putExtra("pincodeStr", pincodeStr);
                intent.putExtra("caterer", caterer);
                intent.putExtra("Photographer", Photographer);
                startActivity(intent);

            }
        });
        pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Photographer.this, dj.class);
                String Photographer = "Raghu Rai";
                intent.putExtra("Indoor", Indoor);
                intent.putExtra("Wedding", Wedding);
                intent.putExtra("wedTheme", Theme);
                intent.putExtra("ckParty", ckParty);
                intent.putExtra("function", function);
                intent.putExtra("mhd", mhd);
                intent.putExtra("hld", hld);
                intent.putExtra("sing", sing);
                intent.putExtra("recp", recp);
                intent.putExtra("editTextTextPersonNameStr", editTextTextPersonNameStr);
                intent.putExtra("Event", Event);
                intent.putExtra("editTextTextMultiLine2Str", editTextTextMultiLine2Str);
                intent.putExtra("editText2Str", editText2Str);
                intent.putExtra("pincodeStr", pincodeStr);
                intent.putExtra("caterer", caterer);
                intent.putExtra("Photographer", Photographer);
                startActivity(intent);

            }
        });
        pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Photographer.this, dj.class);
                String Photographer = "Snapper";
                intent.putExtra("Indoor", Indoor);
                intent.putExtra("Wedding", Wedding);
                intent.putExtra("wedTheme", Theme);
                intent.putExtra("ckParty", ckParty);
                intent.putExtra("function", function);
                intent.putExtra("mhd", mhd);
                intent.putExtra("hld", hld);
                intent.putExtra("sing", sing);
                intent.putExtra("recp", recp);
                intent.putExtra("editTextTextPersonNameStr", editTextTextPersonNameStr);
                intent.putExtra("Event", Event);
                intent.putExtra("editTextTextMultiLine2Str", editTextTextMultiLine2Str);
                intent.putExtra("editText2Str", editText2Str);
                intent.putExtra("pincodeStr", pincodeStr);
                intent.putExtra("caterer", caterer);
                intent.putExtra("Photographer", Photographer);
                startActivity(intent);

            }
        });
        pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Photographer.this, dj.class);
                String Photographer = "Royal Creative Team";
                intent.putExtra("Indoor", Indoor);
                intent.putExtra("Wedding", Wedding);
                intent.putExtra("wedTheme", Theme);
                intent.putExtra("ckParty", ckParty);
                intent.putExtra("function", function);
                intent.putExtra("mhd", mhd);
                intent.putExtra("hld", hld);
                intent.putExtra("sing", sing);
                intent.putExtra("recp", recp);
                intent.putExtra("editTextTextPersonNameStr", editTextTextPersonNameStr);
                intent.putExtra("Event", Event);
                intent.putExtra("editTextTextMultiLine2Str", editTextTextMultiLine2Str);
                intent.putExtra("editText2Str", editText2Str);
                intent.putExtra("pincodeStr", pincodeStr);
                intent.putExtra("caterer", caterer);
                intent.putExtra("Photographer", Photographer);
                startActivity(intent);

            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Photographer.this, caterer.class);
                intent.putExtra("Indoor", Indoor);
                intent.putExtra("Wedding", Wedding);
                intent.putExtra("wedTheme", Theme);
                intent.putExtra("ckParty", ckParty);
                intent.putExtra("function", function);
                intent.putExtra("mhd", mhd);
                intent.putExtra("hld", hld);
                intent.putExtra("sing", sing);
                intent.putExtra("recp", recp);
                intent.putExtra("editTextTextPersonNameStr", editTextTextPersonNameStr);
                intent.putExtra("Event", Event);
                intent.putExtra("editTextTextMultiLine2Str", editTextTextMultiLine2Str);
                intent.putExtra("editText2Str", editText2Str);
                intent.putExtra("pincodeStr", pincodeStr);
                intent.putExtra("caterer", caterer);
                startActivity(intent);

            }
        });

        Skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendj();

            }
        });
    }
    public void opendj() {
        Intent intent = new Intent(Photographer.this, dj.class);
        intent.putExtra("Indoor", Indoor);
        intent.putExtra("Wedding", Wedding);
        intent.putExtra("wedTheme", Theme);
        intent.putExtra("ckParty", ckParty);
        intent.putExtra("function", function);
        intent.putExtra("mhd", mhd);
        intent.putExtra("hld", hld);
        intent.putExtra("sing", sing);
        intent.putExtra("recp", recp);
        intent.putExtra("editTextTextPersonNameStr", editTextTextPersonNameStr);
        intent.putExtra("Event", Event);
        intent.putExtra("editTextTextMultiLine2Str", editTextTextMultiLine2Str);
        intent.putExtra("editText2Str", editText2Str);
        intent.putExtra("pincodeStr", pincodeStr);
        intent.putExtra("caterer", caterer);
        startActivity(intent);
    }
}