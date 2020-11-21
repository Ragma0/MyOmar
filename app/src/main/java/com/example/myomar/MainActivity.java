package com.example.myomar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvresulting = findViewById(R.id.tv_resulting);
        EditText ed_number_1 = findViewById(R.id.ed_number_1);
        EditText ed_number_2 = findViewById(R.id.ed_number_2);


        Button btn_plus = findViewById(R.id.btn_plus);
        Button btn_minus = findViewById(R.id.btn_minus);
        Button btn_multiplied = findViewById(R.id.btn_multiplied);
        Button btn_divided = findViewById(R.id.btn_divided);

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1 = Integer.parseInt(ed_number_1.getText().toString());
                int num2 = Integer.parseInt(ed_number_2.getText().toString());
                int  rez =num1+num2 ;
                tvresulting.setText(String.valueOf(rez));
            }});


                btn_minus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        int num1 = Integer.parseInt(ed_number_1.getText().toString());
                        int num2 = Integer.parseInt(ed_number_2.getText().toString());
                        int rez = num1 - num2;
                        tvresulting.setText(String.valueOf(rez));
                    }});


                                btn_multiplied.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        int num1 = Integer.parseInt(ed_number_1.getText().toString());
                                        int num2 = Integer.parseInt(ed_number_2.getText().toString());
                                        int  rez =num1*num2 ;
                                        tvresulting.setText(String.valueOf(rez));

                                        try {btn_divided.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                int num1 = Integer.parseInt(ed_number_1.getText().toString());
                                                int num2 = Integer.parseInt(ed_number_2.getText().toString());
                                                int  rez =num1/num2 ;
                                                tvresulting.setText(String.valueOf(rez));
                                            }});

                                                }catch (Exception ex){
                                                    Toast.makeText(MainActivity.this, "Mathematical error", Toast.LENGTH_SHORT).show();
                                                }
                                    }
                                });













    }
}