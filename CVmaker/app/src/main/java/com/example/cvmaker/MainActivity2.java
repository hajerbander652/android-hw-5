package com.example.cvmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final TextView yourname = findViewById(R.id.textView2);
        final TextView yourage = findViewById(R.id.textView3);
        final TextView yourjob = findViewById(R.id.textView4);
        final TextView yournumber = findViewById(R.id.textView5);
        final TextView youremail = findViewById(R.id.textView6);
        final Button back = findViewById(R.id.button1);

        Bundle info = getIntent().getExtras();

        String name = info.getString("data1");
        yourname.setText(name);

        String age = info.getString("data2");
        yourage.setText(age);

       String job = info.getString("data3");
       yourjob.setText(job);

       final String number = info.getString("data4");
        yournumber.setText(number);

        final String email = info.getString("data5");
        youremail.setText(email);

        ////////
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backk = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(backk);
            }
        });
        //////
    youremail.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent callemail = new Intent(Intent.ACTION_SEND);
            callemail.setType("text/plain");
            startActivity(callemail);
        }
    });
    //////////
        yournumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel: "+number));
                startActivity(call);
            }
        });




//// no touch////
    }
}