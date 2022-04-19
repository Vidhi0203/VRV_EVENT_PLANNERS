package com.example.vrveventplanners;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class destination extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
//    ImageButton lawn, hall;
    Button Back,Next;
    EditText editTextTextPersonName,editText,editTextTextMultiLine2,editText2,pincode;
//    RadioButton indoor,outdoor,Hotels,banquet_hall,lawn_farmhouse,resort,restaurant,heritage_property,venueWithRooms;
    RadioGroup radioGroup,grp_venueOption;
    TextView yourRequirement;
    String function = "Venue";
    String Door = "Door";

    String Wedding;
    String Theme;
//    String ckParty;
//    String function;
//    String mhd;
//    String hld;
//    String sing;
//    String recp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        yourRequirement = findViewById(R.id.yourRequirement);
        grp_venueOption = findViewById(R.id.grp_venueOption);
        radioGroup = findViewById(R.id.radioGroup);
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
        Theme = i.getStringExtra("wedTheme");
        editText.setText(Wedding);

        radioGroup.setOnCheckedChangeListener(this);
        grp_venueOption.setOnCheckedChangeListener(this);


        yourRequirement.setText(Wedding+"\n"+Theme);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openselect_event();

            }
        });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTextTextPersonNameStr= editTextTextPersonName.getText().toString();
                String Event= editText.getText().toString();
                String editTextTextMultiLine2Str= editTextTextMultiLine2.getText().toString();
                String editText2Str= editText2.getText().toString();
                String pincodeStr= pincode.getText().toString();
                if (editTextTextPersonNameStr.isEmpty()){
                    editTextTextPersonName.setError("Enter name");
                }else if (Event.isEmpty()){
                    editText.setError("Enter name");
                }else if (Door.equals("Door")){
                    Toast.makeText(destination.this, "Please choose Door", Toast.LENGTH_SHORT).show();
                }else if (editTextTextMultiLine2Str.isEmpty()){
                    editTextTextMultiLine2.setError("Enter Address");
                }else if (editText2Str.isEmpty()){
                    editText2.setError("Enter Landmark");
                }else if (pincodeStr.isEmpty()){
                    pincode.setError("Enter Pincode");
                }else if (function.equals("Venue")){
                    Toast.makeText(destination.this, "Please choose Venue", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(destination.this, caterer.class);
//            intent.putExtra("Indoor", Indoor);
                    intent.putExtra("Wedding", Wedding);
                    intent.putExtra("wedTheme", Theme);
                    intent.putExtra("Venue", function);
                    intent.putExtra("Door", Door);
                    intent.putExtra("editTextTextPersonNameStr", editTextTextPersonNameStr);
                    intent.putExtra("Event", Event);
                    intent.putExtra("editTextTextMultiLine2Str", editTextTextMultiLine2Str);
                    intent.putExtra("editText2Str", editText2Str);
                    intent.putExtra("pincodeStr", pincodeStr);
                    startActivity(intent);
                }

            }
        });

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

    }
    public void openselect_event() {
        Intent intent = new Intent(destination.this, SelectEvent.class);
        startActivity(intent);
    }

}