package com.example.vrveventplanners;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import io.paperdb.Paper;

public class login extends AppCompatActivity {
    EditText Email, Password;
    Button Login;
    TextView CreateBtn,createText;
    private ProgressDialog loadingBar;
    private String parentDbName = "Users";
    private CheckBox chkBoxRememberMe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        Login = findViewById(R.id.login);
        CreateBtn = findViewById(R.id.createText);
        chkBoxRememberMe = findViewById(R.id.remember_me_chkb);

        CreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login.this,Register.class);
                startActivity(i);
            }
        });
        Paper.init(this);
        loadingBar = new ProgressDialog(this);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = Email.getText().toString().trim();
                String password = Password.getText().toString().trim();

                if(TextUtils.isEmpty(phone)){
                    Email.setError("Phone is Required");
                }else if (phone.length() <10)
                {
                    Email.setError("Insert minimum 10 digits");
                }
                else if (TextUtils.isEmpty(password)){
                    Password.setError("Password is Required");
                }
                else if (password.length() < 6){
                    Password.setError("Password Must be >= 6 Characters");
                }else if (!chkBoxRememberMe.isChecked()){
                    Toast.makeText(login.this, "Please check remember me box for automatic login again", Toast.LENGTH_SHORT).show();
                }else {
                    loadingBar.setTitle("Login Account");
                    loadingBar.setMessage("Please wait, while we are checking the credentials.");
                    loadingBar.setCanceledOnTouchOutside(false);
                    loadingBar.show();

                    AllowAccessToAccount(password,phone );
                }
            }
        });

    }
    private void AllowAccessToAccount(String password, String phone) {
        if (chkBoxRememberMe.isChecked()) {
            Paper.book().write(Prevalent.UserPhoneKey,phone);
            Paper.book().write(Prevalent.UserPasswordKey, password);
        }
        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance().getReference();
        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {

                if (datasnapshot.child(parentDbName).child(phone).exists()) {

                    UserModel userModel = datasnapshot.child(parentDbName).child(phone).getValue(UserModel.class);
                    if (userModel.getPhone().equals(phone)) {
                        if (userModel.getPassword().equals(password)) {
                            Toast.makeText(login.this, "logged in Successfully...", Toast.LENGTH_SHORT).show();
                            loadingBar.dismiss();

                            Intent intent = new Intent(login.this, MainActivity.class);
                            Prevalent.currentOnlineUser = userModel;
                            startActivity(intent);
                            finish();
                        } else {
                            loadingBar.dismiss();
                            Toast.makeText(login.this, "Password is incorrect", Toast.LENGTH_SHORT).show();
                        }
                    }
//                        else {
//                            Toast.makeText(LoginActivity.this, "", Toast.LENGTH_SHORT).show();
//                        }
                } else {
                    Toast.makeText(login.this, "Account with this " + phone + " Number do not exists.", Toast.LENGTH_SHORT).show();
                    loadingBar.dismiss();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}