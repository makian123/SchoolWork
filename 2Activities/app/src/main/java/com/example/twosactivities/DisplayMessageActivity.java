package com.example.twosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();    //Dobivanje aktivnosti

        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE); //Dobivanje dodatnog teksta iz MainActivity.java
        TextView textView = findViewById(R.id.textView);    //Pronalaženje izlaznog teksta

        textView.setText(message);  //Postavljanje teksta

        Toast toast = Toast.makeText(getApplicationContext(), "Druga aktivnost", Toast.LENGTH_SHORT);   //Toast poruka
        toast.show();   //Pokazivanje toast poruke
    }
}