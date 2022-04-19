package com.example.vrveventplanners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DestinationActivity2 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    //    ImageButton lawn, hall;
    Button Back,Next;
    EditText editTextTextPersonName,editText,editTextTextMultiLine2,editText2,pincode;
//    RadioButton indoor,outdoor;
//            ,Hotels,banquet_hall,lawn_farmhouse,resort,restaurant,heritage_property,venueWithRooms;
    TextView yourRequirement;
    RadioButton indoor,outdoor,Hotels,banquet_hall,lawn_farmhouse,resort,restaurant,heritage_property,venueWithRooms;
    RadioGroup radioGroup;
    String function = "Venue";

    String Door = "Door";

    String Wedding;
    String Indoor;
    String Theme;
    String ckParty;
    String ckPartyfunction;
    String mhd;
    String mhdfunction;
    String hld;
    String hldfunction;
    String singfunction;
    String sing;
    String recp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination2);

        yourRequirement = findViewById(R.id.yourRequirement);
        Next = findViewById(R.id.Next);
        Back = findViewById(R.id.Back);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editText = findViewById(R.id.editText);
        editTextTextMultiLine2 = findViewById(R.id.editTextTextMultiLine2);
        editText2 = findViewById(R.id.editText2);
        pincode = findViewById(R.id.pincode);
//        Hotels = findViewById(R.id.Hotels);
//        indoor = findViewById(R.id.indoor);
//        outdoor = findViewById(R.id.outdoor);
//        banquet_hall = findViewById(R.id.banquet_hall);
//        lawn_farmhouse = findViewById(R.id.lawn_farmhouse);
//        resort = findViewById(R.id.resort);
//        restaurant = findViewById(R.id.restaurant);
//        heritage_property = findViewById(R.id.heritage_property);
//        venueWithRooms = findViewById(R.id.venueWithRooms);
//        heritage_property = findViewById(R.id.heritage_property);

        Intent i = getIntent();
        Wedding = i.getStringExtra("Wedding");
        Indoor = i.getStringExtra("Indoor");
        Theme = i.getStringExtra("wedTheme");
        ckParty = i.getStringExtra("ckParty");
        mhd = i.getStringExtra("mhd");
        hld = i.getStringExtra("hld");
        ckPartyfunction = i.getStringExtra("ckParty function");
        mhdfunction = i.getStringExtra("mhd function");
        hldfunction = i.getStringExtra("hld function");
        singfunction = i.getStringExtra("sing function");
        sing = i.getStringExtra("sing");
        recp = i.getStringExtra("recp");
        editText.setText(Wedding);

//        if (Indoor.equals("null")){
//            yourRequirement.setText(Wedding+"\n"+Theme+"\n"+ckParty+"\n"+function+"\n"+mhd+"\n"+hld+"\n"+sing+"\n"+recp);
//        }else if (Theme.equals("null")){
//            yourRequirement.setText(Wedding+"\n"+Indoor+"\n"+ckParty+"\n"+function+"\n"+mhd+"\n"+hld+"\n"+sing+"\n"+recp);
//        }else if (ckParty.equals("null")){
//            yourRequirement.setText(Wedding+"\n"+Indoor+"\n"+Theme+"\n"+function+"\n"+mhd+"\n"+hld+"\n"+sing+"\n"+recp);
//        }else if (mhd.equals("null")){
//            yourRequirement.setText(Wedding+"\n"+Indoor+"\n"+Theme+"\n"+ckParty+"\n"+function+"\n"+hld+"\n"+sing+"\n"+recp);
//        }else if (hld.equals("null")){
//            yourRequirement.setText(Wedding+"\n"+Indoor+"\n"+Theme+"\n"+ckParty+"\n"+function+"\n"+mhd+"\n"+sing+"\n"+recp);
//        }else if (sing.equals("null")){
//            yourRequirement.setText(Wedding+"\n"+Indoor+"\n"+Theme+"\n"+ckParty+"\n"+function+"\n"+mhd+"\n"+hld+"\n"+recp);
//        }else if (recp.equals("null")){
//            yourRequirement.setText(Wedding+"\n"+Indoor+"\n"+Theme+"\n"+ckParty+"\n"+function+"\n"+mhd+"\n"+hld+"\n"+sing);
//        }else{
//            yourRequirement.setText(Wedding+"\n"+Indoor+"\n"+Theme+"\n"+ckParty+"\n"+function+"\n"+mhd+"\n"+hld+"\n"+sing+"\n"+recp);
//        }

        yourRequirement.setText(Wedding+"\n"+Indoor+"\n"+Theme+"\n"+ckParty+"="+ckPartyfunction+"\n"+
                mhd+"="+mhdfunction+"\n"+hld+"="+hldfunction+"\n"+sing+"="+singfunction+"\n"+recp);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openselect_event();

            }
        });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencaterer();

            }
        });



//        lawn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                opencaterer();
//
//            }
//        });
//
//        hall.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                opencaterer();
//
//            }
//        });

    }
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

        switch (i){

            case R.id.indoor:
                Door="indoor";
                break;

            case R.id.outdoor:
                Door="outdoor";
                break;

            case R.id.Hotels:
                function="4 Star / Above Hotels";
                break;

            case R.id.banquet_hall:
                function="Banquet Halls";
                break;

            case R.id.lawn_farmhouse:
                function="Lawn / Farmhouses";
                break;

            case R.id.resort:
                function="Resort";
                break;

            case R.id.restaurant:
                function="Restaurant / Party Lounge Bar";
                break;

            case R.id.heritage_property:
                function="Heritage Property";
                break;
            case R.id.venueWithRooms:
                function="Venue With Rooms";
                break;



        }
    }
    public void opencaterer() {
        String editTextTextPersonNameStr= editTextTextPersonName.getText().toString();
        String Event= editText.getText().toString();
        String editTextTextMultiLine2Str= editTextTextMultiLine2.getText().toString();
        String editText2Str= editText2.getText().toString();
        String pincodeStr= pincode.getText().toString();
        if (editTextTextPersonNameStr.isEmpty()){
            editTextTextPersonName.setError("Enter name");
        }else if (Event.isEmpty()){
            editText.setError("Enter name");
        }else if (editTextTextMultiLine2Str.isEmpty()){
            editTextTextMultiLine2.setError("Enter Address");
        }else if (editText2Str.isEmpty()){
            editText2.setError("Enter Landmark");
        }else if (pincodeStr.isEmpty()){
            pincode.setError("Enter Pincode");
        }else {
            Intent intent = new Intent(DestinationActivity2.this, caterer.class);
            intent.putExtra("Indoor", Indoor);
            intent.putExtra("Wedding", Wedding);
            intent.putExtra("wedTheme", Theme);
            intent.putExtra("ckParty", ckParty);
            intent.putExtra("ckParty function",ckPartyfunction);
            intent.putExtra("mhd function",mhdfunction);
            intent.putExtra("hld function",hldfunction);
            intent.putExtra("sing function",function);
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
    }
    public void openselect_event() {
        Intent intent = new Intent(DestinationActivity2.this, SelectEvent.class);
        startActivity(intent);
    }

}