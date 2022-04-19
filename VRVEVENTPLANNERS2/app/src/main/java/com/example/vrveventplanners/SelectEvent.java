package com.example.vrveventplanners;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class SelectEvent extends AppCompatActivity {
    ImageView wed,birthday,baby,party,cop,festival;
    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_event);
        wed = findViewById(R.id.wed);
        birthday = findViewById(R.id.birthday);
        baby = findViewById(R.id.baby);
        party = findViewById(R.id.party);
        cop = findViewById(R.id.cop);
        festival = findViewById(R.id.festival);


        wed.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openinout();
            }
        });

        birthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbirthdaytheme();

            }
        });

        baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbabytheme();

            }
        });

        party.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpartytheme();

            }
        });

        cop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencorporatetheme();

            }
        });

        festival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfestivaltheme();

            }
        });
    }
    public void openinout() {
        Intent intent = new Intent(SelectEvent.this, inout.class);
        String wedding = "Wedding";
        intent.putExtra("Wedding",wedding);
        startActivity(intent);
    }
    public void openbirthdaytheme() {
        Intent intent1 = new Intent(SelectEvent.this, birthdaytheme.class);
        String Birthday = "Birthday";
        intent1.putExtra("Wedding",Birthday);
        startActivity(intent1);
    }
    public void openbabytheme() {
        Intent intent2 = new Intent(SelectEvent.this, babytheme.class);
        String BabyShower = "Baby Shower";
        intent2.putExtra("Wedding",BabyShower);
        startActivity(intent2);
    }
    public void openpartytheme() {
        Intent intent3 = new Intent(SelectEvent.this, partytheme.class);
        String Party = "Party";
        intent3.putExtra("Wedding",Party);
        startActivity(intent3);
    }
    public void opencorporatetheme() {
        Intent intent4 = new Intent(SelectEvent.this, corporatetheme.class);
        String CorporateParty = "Corporate Party";
        intent4.putExtra("Wedding",CorporateParty);
        startActivity(intent4);
    }
    public void openfestivaltheme() {
        Intent intent5 = new Intent(SelectEvent.this, festivaltheme.class);
        String FestivalParty = "Festival Party";
        intent5.putExtra("Wedding",FestivalParty);
        startActivity(intent5);
    }
}