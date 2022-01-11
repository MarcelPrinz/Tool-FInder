package com.example.tool_finder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Einstellung extends Startseite {

    Button zurueck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.einstellungs_fenster);
        zurueck = (Button) findViewById(R.id.zurueck);
        zurueck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity();
            }
        });

    }
    public void startActivity() {
        intent = new Intent(Einstellung.this, Startseite.class);
        startActivity(intent);
    }
}