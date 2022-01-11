package com.example.tool_finder;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Startseite <iclude> extends MainActivity {

    Button einstellungen;
    Intent intent;
    Button ausloggen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startseite);

        einstellungen = (Button) findViewById(R.id.einstellungen);
        einstellungen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity();
            }
        });

        ausloggen = (Button) findViewById(R.id.ausloggen);
        ausloggen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity2();
            }
        });
    }

        public void startActivity() {
            intent = new Intent(Startseite.this, Einstellung.class);
            startActivity(intent);
        }
        public void startActivity2() {
        intent = new Intent(Startseite.this, Ausloggen.class);
        startActivity(intent);
    }
    }
