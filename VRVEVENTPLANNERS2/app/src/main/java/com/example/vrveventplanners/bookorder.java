package com.example.vrveventplanners;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class bookorder extends AppCompatActivity {
    Button sdate;
    int syear;
    int smonth;
    int sday;

    int day, month, year, hour, minute;
    int myday, mymonth, myyear, myhour, myminute;
    int mydropday, mydropmonth, mydropyear, mydrophour, mydropminute;
    static final int DATE_PICKER_ID = 1111;
    static final int DATE_DROP_ID = 11;
    private DatabaseReference event;
    EditText evtttl,Fhsno,city,state,member_number;
    String StartDate;
    Button booknow;
    Button edate;
    int eyr;
    int emnt;
    int edy;
    String EndDate;
    TextView dayDiffernt;

    String Wedding;
    String Indoor;
    String Theme;
    String ckParty;
    String function;
    String mhd;
    String hld;
    String sing;
    String recp;
    String name;
    String Event;
    String Address;
    String editText2Str;
    String pincodeStr;
    String caterer;
    String Photographer;
    String dj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookorder);
        sdate = findViewById(R.id.sdate);
        edate = findViewById(R.id.edate);
        evtttl = findViewById(R.id.evtttl);
        Fhsno = findViewById(R.id.Fhsno);
        city = findViewById(R.id.city);
        state = findViewById(R.id.state);
        member_number = findViewById(R.id.member_number);
        booknow = findViewById(R.id.booknow);
        dayDiffernt = findViewById(R.id.dayDiffernt);

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
        name = i.getStringExtra("editTextTextPersonNameStr");
        Event = i.getStringExtra("Event");
        Address = i.getStringExtra("editTextTextMultiLine2Str");
        editText2Str = i.getStringExtra("editText2Str");
        pincodeStr = i.getStringExtra("pincodeStr");
        caterer = i.getStringExtra("caterer");
        Photographer = i.getStringExtra("Photographer");
        dj = i.getStringExtra("dj");
        evtttl.setText(Wedding);

        sdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                showDialog(DATE_PICKER_ID);
            }
        });
        edate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar1 = Calendar.getInstance();
                year = calendar1.get(Calendar.YEAR);
                month = calendar1.get(Calendar.MONTH);
                day = calendar1.get(Calendar.DAY_OF_MONTH);
                showDialog(DATE_DROP_ID);

            }
        });



        booknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String evtttlStr = evtttl.getText().toString();
                String fhsnoStr = Fhsno.getText().toString();
                String cityStr = city.getText().toString();
                String statetr = state.getText().toString();
                String member_numberStr = member_number.getText().toString();

                if (fhsnoStr.isEmpty()){
                    Fhsno.setError("Field can noty be empty");

                }else if (cityStr.isEmpty()){
                    city.setError("Field can noty be empty");

                }else if (statetr.isEmpty()){
                    state.setError("Field can noty be empty");

                }else if (member_numberStr.isEmpty()){
                    member_number.setError("Field can noty be empty");

                }else {

                    event = FirebaseDatabase.getInstance().getReference();

                    HashMap<String,Object> hashMap = new HashMap<>();
                    hashMap.put("Event",evtttlStr);
                    hashMap.put("Address",fhsnoStr);
                    hashMap.put("city",cityStr);
                    hashMap.put("state",statetr);
                    hashMap.put("dayDiffernt",dayDiffernt.getText().toString());
                    hashMap.put("member_number",member_numberStr);
                    hashMap.put("Wedding",Wedding);
                    hashMap.put("Indoor",Indoor);
                    hashMap.put("Theme",Theme);
                    hashMap.put("ckParty",ckParty);
                    hashMap.put("function",function);
                    hashMap.put("mhd",mhd);
                    hashMap.put("hld",hld);
                    hashMap.put("sing",sing);
                    hashMap.put("recp",recp);
                    hashMap.put("editTextTextPersonNameStr",name);
                    hashMap.put("Event",Event);
                    hashMap.put("editTextTextMultiLine2Str",Address);
                    hashMap.put("editText2Str",editText2Str);
                    hashMap.put("pincodeStr",pincodeStr);
                    hashMap.put("caterer",caterer);
                    hashMap.put("Photographer",Photographer);
                    hashMap.put("dj",dj);

                    Log.e("fhd",dj);
                    Log.e("phone",Prevalent.currentOnlineUser.getPhone());
                    event.child("Booked Event").child(Prevalent.currentOnlineUser.getPhone()).child(Wedding).updateChildren(hashMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(bookorder.this, "Your Order Is Booked", Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(bookorder.this,Feedback.class);
                                startActivity(i);
                            }else {
                                Toast.makeText(bookorder.this, "Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }

    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_PICKER_ID:

                DatePickerDialog datePickerDialog = new DatePickerDialog(this, datePickerListener, year, month, day);
                Calendar calendar = Calendar.getInstance();

                calendar.add(Calendar.DATE, 0); // Add 0 days to Calendar
                Date newDate = calendar.getTime();
                datePickerDialog.getDatePicker().setMinDate(newDate.getTime() - (newDate.getTime() % (24 * 60 * 60 * 1000)));
                return datePickerDialog;
            case DATE_DROP_ID:

                DatePickerDialog datePickerDialog1 = new DatePickerDialog(this, datePickerListener1, year, month, day);
                Calendar calendar1 = Calendar.getInstance();

                calendar1.add(Calendar.DATE, 1); // Add 01 days to Calendar
                Date newDate1 = calendar1.getTime();
                datePickerDialog1.getDatePicker().setMinDate(newDate1.getTime() - (newDate1.getTime() % (24 * 60 * 60 * 1000)));
                return datePickerDialog1;
        }
        return null;
    }

    private final DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            myyear = year;
            mymonth = month;
            myday = dayOfMonth;

            sdate.setText(myday + "/" + mymonth+1 + "/" + myyear);
        }
    };

    private final DatePickerDialog.OnDateSetListener datePickerListener1 = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            mydropyear = year;
            mydropmonth = month;
            mydropday = dayOfMonth;
            edate.setText(mydropday  + "/" + mydropmonth+1 + "/" + mydropyear);

            String d1 = sdate.getText().toString();
            String d2 = edate.getText().toString();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());

            Date createdConvertedDate = null, expireCovertedDate = null, todayWithZeroTime = null;
            try {
                createdConvertedDate = dateFormat.parse(d1);
                expireCovertedDate = dateFormat.parse(d2);


                Date today = new Date();

                todayWithZeroTime = dateFormat.parse(dateFormat.format(today));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            int cYear = 0, cMonth = 0, cDay = 0;

            if (createdConvertedDate.after(todayWithZeroTime)) {
                Calendar cCal = Calendar.getInstance();
                cCal.setTime(createdConvertedDate);
                cYear = cCal.get(Calendar.YEAR);
                cMonth = cCal.get(Calendar.MONTH);
                cDay = cCal.get(Calendar.DAY_OF_MONTH);

            } else {
                Calendar cCal = Calendar.getInstance();
                cCal.setTime(todayWithZeroTime);
                cYear = cCal.get(Calendar.YEAR);
                cMonth = cCal.get(Calendar.MONTH);
                cDay = cCal.get(Calendar.DAY_OF_MONTH);
            }
    /*Calendar todayCal = Calendar.getInstance();
    int todayYear = todayCal.get(Calendar.YEAR);
    int today = todayCal.get(Calendar.MONTH);
    int todayDay = todayCal.get(Calendar.DAY_OF_MONTH);
    */

            Calendar eCal = Calendar.getInstance();
            eCal.setTime(expireCovertedDate);

            int eYear = eCal.get(Calendar.YEAR);
            int eMonth = eCal.get(Calendar.MONTH);
            int eDay = eCal.get(Calendar.DAY_OF_MONTH);

            Calendar date1 = Calendar.getInstance();
            Calendar date2 = Calendar.getInstance();

            date1.clear();
            date1.set(cYear, cMonth, cDay);
            date2.clear();
            date2.set(eYear, eMonth, eDay);

            long diff = date2.getTimeInMillis() - date1.getTimeInMillis();

            float dayCount = (float) diff / (24 * 60 * 60 * 1000);
            dayDiffernt.setText((int) dayCount+" Days");
        }
    };

    private void Event(String evtttlStr, String fhsnoStr, String cityStr, String statetr, String member_numberStr) {
        event = FirebaseDatabase.getInstance().getReference();

        HashMap<String,Object> eventmap = new HashMap<>();
        eventmap.put("evtttlStr",evtttlStr);
        eventmap.put("FhsnoStr",fhsnoStr);
        eventmap.put("cityStr",cityStr);
        eventmap.put("statetr",statetr);
        eventmap.put("dayDiffernt",dayDiffernt);
        eventmap.put("member_numberStr",member_numberStr);
        eventmap.put("Wedding",Wedding);
//        eventmap.put("Indoor",Indoor);
//        eventmap.put("Theme",Theme);
//        eventmap.put("ckParty",ckParty);
//        eventmap.put("function",function);
//        eventmap.put("mhd",mhd);
//        eventmap.put("hld",hld);
//        eventmap.put("sing",sing);
//        eventmap.put("recp",recp);
//        eventmap.put("editTextTextPersonNameStr",name);
//        eventmap.put("Event",Event);
//        eventmap.put("editTextTextMultiLine2Str",Address);
//        eventmap.put("editText2Str",editText2Str);
//        eventmap.put("pincodeStr",pincodeStr);
//        eventmap.put("caterer",caterer);
//        eventmap.put("Photographer",Photographer);
//        eventmap.put("dj",dj);

        Log.e("fhd",dj);
        Log.e("phone",Prevalent.currentOnlineUser.getPhone());
        event.child("Booked Event").child(Prevalent.currentOnlineUser.getPhone()).child(Wedding).updateChildren(eventmap).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    Toast.makeText(bookorder.this, "Your Order Is Booked", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(bookorder.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}