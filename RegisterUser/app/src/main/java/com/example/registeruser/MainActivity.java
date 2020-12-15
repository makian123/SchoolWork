package com.example.registeruser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Locale.getDefault().getLanguage() == "en")   //Provjerava je li jezik podešen na engleski, ako je onda prebacuje jezik na engleski
        {
            Locale locale = new Locale("en");
            Locale.setDefault(locale);
            Configuration config = new Configuration();
            config.locale = locale;
            getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        }   //Ako nije onda ostavlja hrvatski

        setContentView(R.layout.activity_main);
        Button registar;    //Stvara gumb
        registar = (Button) findViewById(R.id.button);  //Pronalazi gumb
        registar.setOnClickListener(new View.OnClickListener()  //Stavlja listener na gumb da promjeni text textView-a
        {
            public void onClick(View v) {
                //Pronalazi editText
                EditText ime = findViewById(R.id.editTextIme);
                EditText prezime = findViewById(R.id.editTextPrezime);
                EditText email = findViewById(R.id.editTextEmail);

                //Pronalazi textView
                TextView viewIme = findViewById(R.id.textViewIme);
                TextView viewPrezime = findViewById(R.id.textViewPrezime);
                TextView viewEmail = findViewById(R.id.textViewEmail);

                //Promijenjuje textView tekst na editText tekst
                viewIme.setText(ime.getText());
                viewPrezime.setText(prezime.getText());
                viewEmail.setText(email.getText());
            }
        });

    }
}