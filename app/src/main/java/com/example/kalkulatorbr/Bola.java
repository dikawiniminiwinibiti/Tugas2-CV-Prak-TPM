package com.example.kalkulatorbr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Bola extends AppCompatActivity {

    private Button btn_hasil;
    private EditText jari,hasil;
    private ImageView kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bola);

        kembali = findViewById(R.id.kembali);
        btn_hasil = findViewById(R.id.btn_hasil);
        jari = findViewById(R.id.jari);
        hasil = findViewById(R.id.hasil);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembali = new Intent(getApplicationContext() , MainActivity.class);
                startActivity(kembali);
            }
        });

        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(jari.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Masukkan Angka!",Toast.LENGTH_SHORT).show();
                }
                else{
                    float panjangg = Float.parseFloat(jari.getText().toString());
                    float hasill = (float) ((1.33)*(3.14)*panjangg*panjangg*panjangg);
                    String hasil_string = String.valueOf(hasill);
                    hasil.setText(hasil_string);
                }
            }
        });
    }
}