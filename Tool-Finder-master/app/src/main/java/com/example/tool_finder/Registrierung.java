package com.example.tool_finder;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Registrierung extends MainActivity{
    Button registrieren;
    View.OnClickListener listener;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrierungs_fenster);

        registrieren = (Button) findViewById(R.id.registrieren);
        intent = new Intent(Registrierung.this, MainActivity.class);
        listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        };registrieren.setOnClickListener(listener);

    }
}
