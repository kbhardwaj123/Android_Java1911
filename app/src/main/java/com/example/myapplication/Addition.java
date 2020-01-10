package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Addition extends AppCompatActivity {

    EditText et1,et2;
    Button b;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        b = (Button)findViewById(R.id.button);
        ans = (TextView)findViewById(R.id.tvAns);

        b.setOnClickListener(v -> {
                int i = Integer.parseInt(et1.getText().toString());
                int j = Integer.parseInt(et2.getText().toString());

                int k = i + j;
                ans.setText("Ans is:" + k);

            }
        );

    }

}
