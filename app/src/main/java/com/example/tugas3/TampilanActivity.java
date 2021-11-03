package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.security.Key;

import javax.xml.transform.Result;

public class TampilanActivity extends AppCompatActivity {

    private TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);


        String etAlamat = getIntent().getExtras().getString("alamat");
        String etHp = getIntent().getExtras().getString("KeyHp");
        String etEmail = getIntent().getExtras().getString("etEmail");
        String rgGender = getIntent().getExtras().getString("etGender");
        String ValueKelas = getIntent().getExtras().getString("etKelas");
        String tvUKM = getIntent().getExtras().getString("tvUKM");



        result = findViewById(R.id.Tampilan);
        result.setText("Alamat : "+etAlamat+"\n\nHp : " +etHp+" \n\nEmail : "+etEmail+" \n\nJenis Kelamin : "+rgGender+"\n\nKelas : "+ValueKelas+"\n\nUKM : "+tvUKM+"");


    }
}

