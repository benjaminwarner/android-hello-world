package com.example.benjamin.codepath_hello_world;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String originalHelloText;
    private int originalBackgroundColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView helloTextView = findViewById(R.id.helloTextView);
        originalHelloText = (String)helloTextView.getText();

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

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RelativeLayout rootView = (RelativeLayout)v;
                rootView.setBackgroundColor(getResources().getColor(R.color.holo_purple));
                TextView helloTextView = findViewById(R.id.helloTextView);
                helloTextView.setText(originalHelloText);
                helloTextView.setTextColor(getResources().getColor(R.color.black));
            }
        });
    }
}
