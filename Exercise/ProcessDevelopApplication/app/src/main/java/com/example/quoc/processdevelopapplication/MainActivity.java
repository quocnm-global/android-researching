package com.example.quoc.processdevelopapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtContent;
    Button btnClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtContent = findViewById(R.id.textViewContent);
        btnClickMe = findViewById(R.id.buttonClick);

        txtContent.setText("Android Programing");
        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtContent.setText("Clicked");
            }
        });

    }
}
