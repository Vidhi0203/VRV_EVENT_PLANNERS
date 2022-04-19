package com.example.vrveventplanners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button next,logout;
    RecyclerView featured_recycle;
    ArrayList<FeedbackModel> list;
    FeedbackAdapter feedbackAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = findViewById(R.id.next);
        logout = findViewById(R.id.logout);
        featured_recycle = findViewById(R.id.featured_recycle);
        featured_recycle.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        featured_recycle.setHasFixedSize(true);
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPage);
        ImageAdapter adapterView = new ImageAdapter(this);
        mViewPager.setAdapter(adapterView);

        list = new ArrayList<FeedbackModel>();
        feedbackAdapter = new FeedbackAdapter(MainActivity.this,list);
        featured_recycle.setAdapter(feedbackAdapter);

//        DatabaseReference productsRef = FirebaseDatabase.getInstance().getReference("Feedback");

//        productsRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
////                for (DataSnapshot dataSnapshot:snapshot.getChildren()){
////
////                    FeedbackModel info = dataSnapshot.getValue(FeedbackModel.class);
////                    list.add(info);
////                }
//                if (snapshot.exists()){
//                    FeedbackModel info = snapshot.getValue(FeedbackModel.class);
//                    list.add(info);
//                }
//                feedbackAdapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
//
//
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(MainActivity.this,SelectEvent.class);
                startActivity(i);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(MainActivity.this,login.class);
                startActivity(i);
                finish();
            }
        });
    }

    public void logout1(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), login.class));
        finish();
    }

    public void Next(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), SelectEvent.class));
        finish();
    }
}
