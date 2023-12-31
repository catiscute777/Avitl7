package com.example.avitl7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private int counter=0;
    private  TextView tv1;
    Button btn1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.Text);
        tv1 = findViewById(R.id.Text1);
        btn = (Button) findViewById(R.id.button1);
        btn1 = (Button) findViewById(R.id.button2) ;
        tv.setTextColor(Color.RED);
        tv.setTextSize(40);
        tv.setVisibility(View.GONE);
        tv1.setVisibility(View.GONE);
        btn.setVisibility(View.GONE);
        tv1.setText("you got 10 clicks");
        tv1.setTextSize(40);




    }

    public void go(View view) {
        tv.setTextColor(Color.RED);
        tv.setText("HELLO WORLD");
        btn.setVisibility(view.GONE);
        counter=counter+1;
        if(counter == 10){
            tv1.setVisibility(View.VISIBLE);
            btn.setVisibility(View.GONE);
            btn1.setVisibility(View.GONE);}





    }

    public void go1(View view) {
        tv.setText("HELLO AVITAL");
        tv.setTextColor(Color.CYAN);
        btn.setVisibility(View.VISIBLE);
        tv.setVisibility(View.VISIBLE);
        counter=counter+1;
        if(counter >= 10){
            tv1.setVisibility(View.VISIBLE);
        btn.setVisibility(View.GONE);
            btn1.setVisibility(View.GONE) ;}

    }

}


