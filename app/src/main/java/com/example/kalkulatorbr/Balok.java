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

public class Balok extends AppCompatActivity {

    private Button btn_hasil;
    private EditText panjang,tinggi,lebar,hasil;
    private ImageView kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.balok);

        kembali = findViewById(R.id.kembali);
        btn_hasil = findViewById(R.id.btn_hasil);
        panjang = findViewById(R.id.panjang);
        tinggi = findViewById(R.id.tinggi);
        lebar = findViewById(R.id.lebar);
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
                if (TextUtils.isEmpty(panjang.getText().toString())||TextUtils.isEmpty(tinggi.getText().toString())||TextUtils.isEmpty(lebar.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Masukkan Angka!",Toast.LENGTH_SHORT).show();
                }
                else{
                    float panjangg = Float.parseFloat(panjang.getText().toString());
                    float tinggii = Float.parseFloat(tinggi.getText().toString());
                    float lebarr = Float.parseFloat(lebar.getText().toString());
                    float hasill = panjangg * tinggii * lebarr;
                    String hasil_string = String.valueOf(hasill);
                    hasil.setText(hasil_string);
                }
            }
        });
    }
}