package com.example.benjamin.codepath_hello_world;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.changeTextColorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Ben", "Button click!");
                TextView helloTextView = findViewById(R.id.helloTextView);
                helloTextView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            }
        });
    }
}
