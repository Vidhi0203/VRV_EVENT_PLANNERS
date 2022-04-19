package com.example.vrveventplanners;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class caterer extends AppCompatActivity {

    ImageButton coutyard,ambani,taj,raddison;
    Button Back,Skip;

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
    String Door;
    String function1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caterer);
        coutyard = findViewById(R.id.courtyard);
        ambani = findViewById(R.id.ambani);
        taj = findViewById(R.id.taj);
        raddison = findViewById(R.id.raddison);
//        Back = findViewById(R.id.Back);
        Skip = findViewById(R.id.Skip);

        Intent i = getIntent();
        Wedding = i.getStringExtra("Wedding");
        function1 = i.getStringExtra("Venue");
        Door = i.getStringExtra("Door");
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

        coutyard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(caterer.this, Photographer.class);
                String coutyard = "Courtyard By Marriot Catering";
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
                intent.putExtra("caterer", coutyard);
                startActivity(intent);

            }
        });

        ambani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(caterer.this, Photographer.class);
                String coutyard = "Foodlink Catering";
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
                intent.putExtra("caterer", coutyard);
                startActivity(intent);

            }
        });
        taj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(caterer.this, Photographer.class);
                String coutyard = "Taj Catering";
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
                intent.putExtra("caterer", coutyard);
                startActivity(intent);

            }
        });

        raddison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(caterer.this, Photographer.class);
                String coutyard = "Radisson Blu Catering";
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
                intent.putExtra("caterer", coutyard);
                startActivity(intent);

            }
        });

//        Back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                opendestination();
//
//            }
//        });

        Skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhotographer();

            }
        });
    }
    public void openPhotographer() {
        Intent intent = new Intent(caterer.this, Photographer.class);
//        String str = "caterer"
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
        startActivity(intent);
    }
//    public void opendestination() {
//        Intent intent = new Intent(caterer.this, destination.class);
//        intent.putExtra("Indoor", Indoor);
//        intent.putExtra("Wedding", Wedding);
//        intent.putExtra("wedTheme", Theme);
//        intent.putExtra("ckParty", ckParty);
//        intent.putExtra("function", function);
//        intent.putExtra("mhd", mhd);
//        intent.putExtra("hld", hld);
//        intent.putExtra("sing", sing);
//        intent.putExtra("recp", recp);
//        intent.putExtra("editTextTextPersonNameStr", editTextTextPersonNameStr);
//        intent.putExtra("Event", Event);
//        intent.putExtra("editTextTextMultiLine2Str", editTextTextMultiLine2Str);
//        intent.putExtra("editText2Str", editText2Str);
//        intent.putExtra("pincodeStr", pincodeStr);
//        startActivity(intent);
//    }
}