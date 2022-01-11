package com.example.tool_finder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String eMail;
    String passwort;
    String nutzerName;

    EditText eMailEingeben;
    EditText passwortEingeben;
    EditText nutzerNameEingeben;

    Button registrieren;
    Button anmelden;
    View.OnClickListener listener;
    Intent intent;
    Intent intent2;


    //Funktioniert nicht
    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anmelde_fenster);

        registrieren = (Button) findViewById(R.id.RegistriereDich);
        intent = new Intent(MainActivity.this, Registrierung.class);
        listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
       };registrieren.setOnClickListener(listener);
    }
    */


    //funktioniert nur mit einer Verlinkung
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anmelde_fenster);

        registrieren = (Button) findViewById(R.id.RegistriereDich);
        // mit dem klick auf dem Button wird die Methode getriggert
        registrieren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity();
            }
        });
    }
    public void startActivity() {
        intent = new Intent(this, Registrierung.class);
        startActivity(intent);
    }
}*/


    //Notiz: wir wollen 2 verlinkungen, Problem: App stüzt app
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anmelde_fenster);
        anmelden = (Button) findViewById(R.id.AnmeldenDich);
        anmelden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity2();

            }
        });

        registrieren = (Button) findViewById(R.id.RegistriereDich);
        registrieren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity();
            }
        });
    }


    public void startActivity() {
        intent = new Intent(MainActivity.this, Registrierung.class);
        startActivity(intent);
    }


    public void startActivity2(){
    intent2 = new Intent (MainActivity.this, Startseite.class);
    startActivity(intent2);
    }
}
