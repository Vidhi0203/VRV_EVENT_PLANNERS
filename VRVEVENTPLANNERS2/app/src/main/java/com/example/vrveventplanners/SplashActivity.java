package com.example.vrveventplanners;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import io.paperdb.Paper;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        loadingBar = new ProgressDialog(this);
        Paper.init(this);
        String UserPhoneKey = Paper.book().read(Prevalent.UserPhoneKey);
        String UserPasswordKey = Paper.book().read(Prevalent.UserPasswordKey);

        if (UserPhoneKey != "" && UserPasswordKey != "") {
            if (!TextUtils.isEmpty(UserPhoneKey) && !TextUtils.isEmpty(UserPasswordKey)) {
                AllowAccess(UserPhoneKey, UserPasswordKey);
            } else {
                Intent intent = new Intent(SplashActivity.this, login.class);
                startActivity(intent);
            }
        }
    }
    private void AllowAccess(final String phone, final String password)
    {

//        loadingBar.setTitle("Already Logged in");
//        loadingBar.setMessage("Please wait.....");
//        loadingBar.setCanceledOnTouchOutside(false);
//        loadingBar.show();
        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance().getReference();
        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.child("Users").child(phone).exists()){

                    UserModel usersData = dataSnapshot.child("Users").child(phone).getValue(UserModel.class);
                    if (usersData.getPhone().equals(phone) && usersData.getPassword().equals(password))
                    {

                        Toast.makeText(SplashActivity.this, " you are already logged in...", Toast.LENGTH_SHORT).show();
//                            loadingBar.dismiss();

                        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                        Prevalent.currentOnlineUser = usersData;
                        Log.e("currentOnlineUser", String.valueOf(Prevalent.currentOnlineUser));
                        startActivity(intent);
                        finish();
                        DatabaseReference cartListRef = FirebaseDatabase.getInstance().getReference().child("CartList");

                        cartListRef.child(Prevalent.currentOnlineUser.getPhone()).child("product").addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                int num = 0;
                                for (DataSnapshot item:snapshot.getChildren()){

                                    Log.e("item", String.valueOf(item));
                                    String name = item.child("phone").getValue(String.class);
                                    String phone = item.child("phone").getValue(String.class);
                                    Log.e("phone", phone);
                                    if (Prevalent.currentOnlineUser.getPhone().equals(phone)) {
                                        num =  num+1;
                                    }
                                    Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                                    intent.putExtra("number",num);
                                    Log.e("number,", String.valueOf(num));
                                    startActivity(intent);
                                    finish();
                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });

                    }
                }
                else {
//                    loadingBar.dismiss();
                    Intent intent = new Intent(SplashActivity.this, login.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}