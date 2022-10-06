package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);

        textView1.setText(getIntent().getStringExtra("name"));
        textView2.setText(getIntent().getStringExtra("location"));
        textView3.setText(getIntent().getStringExtra("mobileNumber"));

    }
}