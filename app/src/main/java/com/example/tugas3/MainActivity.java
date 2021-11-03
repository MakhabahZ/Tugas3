package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi Variable
    EditText etNama, etNIM, etProdi;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inisiasi Variable
        etNama = findViewById(R.id.etNama);
        etNIM = findViewById(R.id.etNim);
        etProdi = findViewById(R.id.etProdi);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String nama = etNama.getText().toString();
                    String NIM = etNIM.getText().toString();
                    String Prodi = etProdi.getText().toString();

                    //Pengecekan prodi harus di isi
                    if (Prodi.isEmpty()) {
                        Toast.makeText(getApplication(), "Program studi harus diisi", Toast.LENGTH_SHORT).show();
                    }else {
                        //Passing Data Via Bundle
                        Bundle bundle = new Bundle();
                        bundle.putString("keyNama", nama);
                        bundle.putString("keyNIM", NIM);
                        bundle.putString("keyProdi", Prodi);
                        Intent i = new Intent(MainActivity.this, BiodataActivity.class);
                        i.putExtras(bundle);
                        startActivity(i);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR TRY AGAIN!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}