package com.example.vrveventplanners;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Feedback extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    EditText name,editTextTextPersonName4;
    Button submit;
    String function = "Feedback";
    String Friends = "Friends";
    RadioGroup radioGroup,grp2;
    TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        radioGroup = (RadioGroup) findViewById(R.id.grp1);
        grp2 = (RadioGroup) findViewById(R.id.grp2);
        name = findViewById(R.id.name);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        submit = findViewById(R.id.submit);
        textView6 = findViewById(R.id.textView6);

        radioGroup.setOnCheckedChangeListener(this);
        grp2.setOnCheckedChangeListener(this);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameS = name.getText().toString();
                String feedbackS = editTextTextPersonName4.getText().toString();
                if (nameS.isEmpty()){
                    name.requestFocus();
                    name.setError("Enter Name");
                }else if (function.equals("Feedback")){
                    Toast.makeText(Feedback.this, "Please choose Did you enjoy using this Application", Toast.LENGTH_SHORT).show();
                }else if (Friends.equals("Friends")){
                    Toast.makeText(Feedback.this, "Will you recommend our Application to your Friends?", Toast.LENGTH_SHORT).show();
                }else if (feedbackS.isEmpty()){
                    editTextTextPersonName4.requestFocus();
                    editTextTextPersonName4.setError("Enter Feedback");
                }else{
                    DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Feedback");

                    HashMap<String,Object> feedback = new HashMap<>();
                    feedback.put("name",nameS);
                    feedback.put("function",function);
                    feedback.put("Friends",Friends);
                    feedback.put("feedback",feedbackS);

                    reference.child(nameS).updateChildren(feedback).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(Feedback.this, "Thanks", Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(Feedback.this,MainActivity.class);
                                startActivity(i);
                            }
                        }
                    });
                }
            }
        });

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {

            case R.id.radioButton2:
                function = "Yes";
                break;

            case R.id.radioButton3:
                function = "No";
                break;

            case R.id.radioButton4:
                Friends = "Yes";
                break;

            case R.id.radioButton5:
                Friends = "No";
                break;
        };
    }
}