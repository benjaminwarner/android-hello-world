package com.example.benjamin.codepath_hello_world;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.changeTextColorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView helloTextView = findViewById(R.id.helloTextView);
                helloTextView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            }
        });

        findViewById(R.id.changeBackgroundColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RelativeLayout rootView = findViewById(R.id.rootView);
                rootView.setBackgroundColor(getResources().getColor(R.color.cyan));
            }
        });

        findViewById(R.id.changeTextString).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView helloTextView = findViewById(R.id.helloTextView);
                helloTextView.setText("Android is awesome!");
            }
        });
    }
}
