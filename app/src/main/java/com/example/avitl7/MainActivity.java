package com.example.avitl7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.Text);
        btn = (Button) findViewById(R.id.button1);
        tv.setTextColor(Color.RED);
        tv.setTextSize(40);


    }

    public void go(View view) {
        tv.setText("HELLO WORLD");



    }

    public void go1(View view) {
        tv.setText("HELLO AVITAL");
    }
}
