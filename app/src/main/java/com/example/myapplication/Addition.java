package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Addition extends AppCompatActivity {

    // EditText et1,et2;
    // Button b;
    // TextView ans;

    Button bt_notif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_addition);

    bt_notif = findViewById(R.id.btn_notif);
    bt_notif.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String message = "This is a sample notif";
            NotificationCompat.Builder builder = new NotificationCompat.Builder(
                    Addition.this
            )
                    .setSmallIcon(R.drawable.ic_message)
                    .setContentTitle(message)
                    .setAutoCancel(true);
            Intent intent = new Intent(Addition.this,
                    NotificationActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("message",message);
            PendingIntent pi = PendingIntent.getActivity(Addition.this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
            builder.setContentIntent(pi);
            NotificationManager nm = (NotificationManager)getSystemService(
                    NOTIFICATION_SERVICE
            );
            nm.notify(0,builder.build());
        }
    });

    //     EditText etName,etEmail,etPass;
    //     RadioButton r1,r2;
    //     RadioGroup rg;
    //     etEmail =(EditText) findViewById(R.id.input_email);
    //     etName =(EditText) findViewById(R.id.input_name);
    //     etPass =(EditText) findViewById(R.id.input_password);
    //     r1 =(RadioButton) findViewById(R.id.f);
    //     r2 =(RadioButton) findViewById(R.id.m);
    //     rg =(RadioGroup) findViewById(R.id.radioGroup);



    //     b = (Button) findViewById(R.id.btn_signup);
    //     b.setOnClickListener(new View.OnClickListener() {
    //         @Override
    //         public void onClick(View v) {
    //             final String name = etName.getText().toString();
    //             final String email = etEmail.getText().toString();
    //             final String pass = etPass.getText().toString();
    //             String gender = "";
    //             if(r1.isChecked()) gender ="Female";
    //             if(r2.isChecked()) gender= "Male";
    //             Toast.makeText(Addition.this, "Clicked",Toast.LENGTH_LONG).show();

    //             Intent intent = new Intent(Addition.this ,ShowData.class);
    //             intent.putExtra("name", name);
    //             intent.putExtra("email", email);
    //             intent.putExtra("Gender", gender);

    //             startActivity(intent);
    //         }
    //     });

        //et1 = (EditText)findViewById(R.id.et1);
        //et2 = (EditText)findViewById(R.id.et2);
        //b = (Button)findViewById(R.id.button);
        //ans = (TextView)findViewById(R.id.tvAns);

        //b.setOnClickListener(v -> {
          //      int i = Integer.parseInt(et1.getText().toString());
          //      int j = Integer.parseInt(et2.getText().toString());

          //      int k = i + j;
          //      ans.setText("Ans is:" + k);

            //}
        //);

    }

}
