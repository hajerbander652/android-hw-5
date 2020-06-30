package com.example.cvmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
final EditText name = findViewById(R.id.editname);
        final EditText age = findViewById(R.id.editage);
        final EditText job= findViewById(R.id.editjob);
        final EditText number = findViewById(R.id.editnumber);
        final EditText email = findViewById(R.id.editemail);
        final Button next = findViewById(R.id.button);

//////////////
next.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       Intent go = new Intent(MainActivity.this,MainActivity2.class);
       go.putExtra("data1",name.getText().toString());
       go.putExtra("data2",age.getText().toString());
       go.putExtra("data3",job.getText().toString());
       go.putExtra("data4",number.getText().toString());
       go.putExtra("data5",email.getText().toString());
       startActivity(go);
    }
});
///////////


            }





//not to be touched//
    }
