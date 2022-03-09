package com.example.sampleconstraintlayoutevenbutton;

import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class Activitykedua extends AppCompatActivity {
    //Mendeklarasikan variabel dengan tipe data TextView
    TextView txEmail, txPassword;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_kedua);


    //Menghubungkan variable txEmail dengan componen Textview pada layout
    txEmail = findViewById(R.id.tvEmail);

    //menghubungkan variable txEmail dengan componen Textview pada layout
    txPassword = findViewById(R.id.tvPassword);

    //mendekLarasikan variable bundle yang digunakan untuk mengambil
    // pesan yang dikirimkan melalui method intent
    Bundle bundle = getIntent().getExtras();

    //membuat variable string yang digunakan untuk menyimpan data yang
    // dikirimkan dari activity sebelumnya dengan kunci "a"
    String email =  bundle.getString(  "a");

    //membuat variable string yang digunakan untuk menyimpan data yang
    // dikirimkan dari activity sebelumnya dengan kunci
    String pass = bundle.getString("b");

    //menampilkan value dari variabel email kedalam txEmail
    txEmail.setText(email);

    //menampilkan value dari variabel pass kedalam txPassword
    txPassword.setText(pass);
    }


}
