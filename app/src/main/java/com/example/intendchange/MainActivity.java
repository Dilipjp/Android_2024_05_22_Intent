package com.example.intendchange;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button nextbtn, fbbtn, infobtn;
    EditText eTage, eTname;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextbtn = findViewById(R.id.btn_first);
        fbbtn = findViewById(R.id.btn_fb);
        infobtn = findViewById(R.id.btn_info);

        eTname = findViewById(R.id.info);
        eTage = findViewById(R.id.age);


        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);

            }
        });
        fbbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(Intent.ACTION_VIEW);
                j.setData(Uri.parse("https://www.facebook.com"));
                startActivity(j);
            }
        });

        infobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = eTname.getText().toString().trim();
                String age = eTage.getText().toString().trim();
                Intent k = new Intent(MainActivity.this, InfoActivity.class);
                k.putExtra("name",name);
                k.putExtra("age",age);
                startActivity(k);
            }
        });










    }
}