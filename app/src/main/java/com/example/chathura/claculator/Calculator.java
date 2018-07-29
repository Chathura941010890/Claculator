package com.example.chathura.claculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
    private Button Addition,Subtraction,Multiplication,Division;
    private EditText edit1, edit2, display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Addition = (Button)findViewById(R.id.btnAdd);
        Subtraction = (Button)findViewById(R.id.btnSub);
        Multiplication = (Button)findViewById(R.id.btnMul);
        Division = (Button)findViewById(R.id.btnDev);
        edit1 = (EditText)findViewById(R.id.edit1);
        edit2 = (EditText)findViewById(R.id.edit2);
        display = (EditText)findViewById(R.id.display);

        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(edit1.getText().toString().equals("") || edit2.getText().toString().equals("")){
                    Toast.makeText(Calculator.this, "Please enter two numbers", Toast.LENGTH_SHORT).show();
                }
                else{
                   String s1 = edit1.getText().toString();
                   String s2 = edit2.getText().toString();
                    double t1 = Double.valueOf(s1);
                    double t2 = Double.valueOf(s2);
                    double ans = t1 + t2;

                    display.setText(String.valueOf(ans));
                }
            }
        }
        );

        Subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(edit1.getText().toString().equals("") || edit2.getText().toString().equals("")){
                    Toast.makeText(Calculator.this, "Please enter two numbers", Toast.LENGTH_SHORT).show();
                }
                else{
                    String s1 = edit1.getText().toString();
                    String s2 = edit2.getText().toString();
                    double t1 = Double.valueOf(s1);
                    double t2 = Double.valueOf(s2);
                    double ans = t1 - t2;

                    display.setText(String.valueOf(ans));
                }
            }
        }
        );

        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(edit1.getText().toString().equals("") || edit2.getText().toString().equals("")){
                    Toast.makeText(Calculator.this, "Please enter two numbers", Toast.LENGTH_SHORT).show();
                }
                else{
                    String s1 = edit1.getText().toString();
                    String s2 = edit2.getText().toString();
                    double t1 = Double.valueOf(s1);
                    double t2 = Double.valueOf(s2);
                    double ans = t1 * t2;

                    display.setText(String.valueOf(ans));
                }
            }
        }
        );

        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(edit1.getText().toString().equals("") || edit2.getText().toString().equals("")){
                    Toast.makeText(Calculator.this, "Please enter two numbers", Toast.LENGTH_SHORT).show();
                }
                else{
                    String s1 = edit1.getText().toString();
                    String s2 = edit2.getText().toString();
                    double t1 = Double.valueOf(s1);
                    double t2 = Double.valueOf(s2);
                    double ans = t1 / t2;

                    display.setText(String.valueOf(ans));
                }
            }
        }
        );
    }
}
