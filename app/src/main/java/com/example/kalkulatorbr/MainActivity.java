package com.example.kalkulatorbr;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btn_kubus,btn_balok,btn_kerucut,btn_bola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_kubus = findViewById(R.id.btn_kubus);
        btn_balok = findViewById(R.id.btn_balok);
        btn_kerucut = findViewById(R.id.btn_kerucut);
        btn_bola = findViewById(R.id.btn_bola);

        btn_kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kubus = new Intent(getApplicationContext() , Kubus.class);
                startActivity(kubus);
            }
        });
        btn_balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent balok = new Intent(getApplicationContext() , Balok.class);
                startActivity(balok);
            }
        });
        btn_kerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kerucut = new Intent(getApplicationContext() , Kerucut.class);
                startActivity(kerucut);
            }
        });
        btn_bola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bola = new Intent(getApplicationContext() , Bola.class);
                startActivity(bola);
            }
        });
    }
}