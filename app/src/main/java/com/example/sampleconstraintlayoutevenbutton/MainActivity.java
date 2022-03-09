package com.example.sampleconstraintlayoutevenbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk Edit Text
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Menghubungkan variabel btnLogin dengan componen button
        btnLogin=findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edpassword=findViewById(R.id.edPassword);


     //membuat fungsi onclik pada button btnLogin
     btnLogin.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             //menyimpan input user di edittext email kedalam variabel nama
             nama = edemail.getText().toString();

             //menyimpan input user di edittext password kedalam variabel password
             password = edpassword.getText().toString();

             //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
             if (nama.equals("admin@mail.com") && password.equals("123")){
                 Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_LONG).show();

                 //membuat objek bundle
                 Bundle b = new Bundle();

                 //memasukkan value dari variable nama dengan kunci "a"
                 // dan dimasukkan kedalam bundle
                 b.putString("a",nama.trim());

                 //memasukkan value dari variable password dengan kunci "b"
                 // dan dimasukkan kedalam bundle
                 b.putString("b",password.trim());

                 //membuat objek intent berpindah activity dari mainativity ke ActivityHasil
                 Intent i = new Intent(getApplicationContext(), Activitykedua.class);

                 //memasukkan bundle kedalam intent untuk dikirimkan ke Activityke2
                 i.putExtras(b);

                 //berpindah ke Activityke2
                 startActivity(i);
             }
             else if (nama.equals("admin@mail.com") && password.equals(password)){
                 Toast.makeText(MainActivity.this, "Password Salah", Toast.LENGTH_LONG).show();
             }
             else if (nama.equals(nama) && password.equals("123")){
                 Toast.makeText(MainActivity.this, "Email Salah", Toast.LENGTH_LONG).show();
             }
             else {
                 Toast.makeText(MainActivity.this, "Email dan Password Salah", Toast.LENGTH_LONG).show();
             }
         }
     });
    }

}