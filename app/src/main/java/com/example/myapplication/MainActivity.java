package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_click;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_click = findViewById(R.id.btn_test);
        tv = findViewById(R.id.main_tv);
        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Hello");
            }
        });
    }
}
