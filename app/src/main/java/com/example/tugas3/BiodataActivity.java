package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class BiodataActivity extends AppCompatActivity {

    EditText etAlamat, etHp, etEmail, etPassword;
    RadioGroup rgGender;
    RadioButton Perempuan, Laki;
    Spinner Kspinner;
    TextView tvKelas, tvUKM, ValueKelas;
    CheckBox cbAMCC, cbHIMSSI, cbKOMA;
    Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        //Inisiasi Variable
        etAlamat = findViewById(R.id.etAlamat);
        etHp = findViewById(R.id.etHp);
        etEmail = findViewById(R.id.etEmail);
        rgGender = findViewById(R.id.rgGender);
        Perempuan = findViewById(R.id.Perempuan);
        etPassword = findViewById(R.id.etPassword);
        Laki = findViewById(R.id.Laki);
        Kspinner = findViewById(R.id.Kspinner);
        cbAMCC = findViewById(R.id.cbAMCC);
        cbHIMSSI = findViewById(R.id.cbHIMSSI);
        cbKOMA = findViewById(R.id.cbKOMA);
        tvUKM = findViewById(R.id.tvUKM);
        btnSimpan = findViewById(R.id.btnSimpan);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alamat = String.valueOf(etAlamat.getText().toString());
                String hp = String.valueOf(etHp.getText().toString());
                String email = String.valueOf(etEmail.getText().toString());
                String password = String.valueOf(etPassword.getText().toString());
                String prodi = Kspinner.getItemAtPosition(Kspinner.getSelectedItemPosition()).toString();
//                bundle.putString("key2", type.getItemAtPosition(type.getSelectedItemPosition()).toString());
                String jk;
                if (Laki.isChecked()){
                    jk = "Laki-Laki";
                } else {
                    jk = "Perempuan";
                }


                String UKM ="";
                if (cbAMCC.isChecked()){
                    UKM += "AMCC \n";
                }
                if (cbHIMSSI.isChecked()){
                    UKM += "HIMSSI \n";
                }
                if (cbKOMA.isChecked()){
                    UKM += "KOMA";
                }

                Bundle bundle = new Bundle();
                bundle.putString("Kelas", Kspinner.getItemAtPosition(Kspinner.getSelectedItemPosition()).toString());
                bundle.putString("etAlamat", alamat);
                bundle.putString("etHp", hp);
                bundle.putString("etEmail", email);
                bundle.putString("etPassword", password);
//                bundle.putString("keyProdi", prodi);
                bundle.putString("rgGender", jk);
                bundle.putString("tvUKM", UKM);
                Intent i = new Intent(BiodataActivity.this, TampilanActivity.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });






    }




    }




