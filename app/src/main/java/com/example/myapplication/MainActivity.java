package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button toast;
    Button tv;
    Button go;

    EditText name;
    EditText location;
    EditText mobileNumber;

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast=findViewById(R.id.toast);
        tv=findViewById(R.id.tv);
        go=findViewById(R.id.go);

        name=findViewById(R.id.name);
        location=findViewById(R.id.location);
        mobileNumber=findViewById(R.id.mobileNumber);

        textView=findViewById(R.id.textView4);




        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = name.getText().toString();
                String location1 = location.getText().toString();
                String mobileNumber1 = mobileNumber.getText().toString();
                Toast.makeText(MainActivity.this, name1 + "\n" +location1 + "\n" + mobileNumber1,Toast.LENGTH_SHORT).show();
            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = name.getText().toString();
                String location1 = location.getText().toString();
                String mobileNumber1 = mobileNumber.getText().toString();
                textView.setText(name1 + "\n" +location1 + "\n" + mobileNumber1);

            }
        });

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                intent.putExtra("name",name.getText().toString());
                intent.putExtra("location",location.getText().toString());
                intent.putExtra("mobileNumber",mobileNumber.getText().toString());

                startActivity(intent);
            }
        });


    }
}