package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String gender = intent.getStringExtra("gender");

        TextView name1 = (TextView)findViewById(R.id.disp_name);
        TextView email1 = (TextView)findViewById(R.id.disp_email);
        TextView gender1 = (TextView)findViewById(R.id.disp_gender);

        name1.setText(name);
        email1.setText(email);
        gender1.setText(gender);


    }
}
