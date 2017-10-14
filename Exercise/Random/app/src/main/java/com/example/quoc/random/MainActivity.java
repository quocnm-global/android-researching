package com.example.quoc.random;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText edtNumStart;
    EditText edtNumEnd;
    Button btnRandom;
    TextView txtResult;

    private void init() {
        edtNumStart = findViewById(R.id.editTextNumStart);
        edtNumEnd = findViewById(R.id.editTextNumEnd);
        btnRandom = findViewById(R.id.buttonRandom);
        txtResult = findViewById(R.id.textViewResult);

        txtResult.setText("");
        txtResult.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "ShowToast"})
            @Override
            public void onClick(View view) {

                String stringRandomStart = edtNumStart.getText().toString().trim();
                String stringRandomEnd = edtNumEnd.getText().toString().trim();

                if (stringRandomStart.isEmpty() || stringRandomStart.isEmpty()) {
                    System.out.println("Input null");
                    Toast.makeText(MainActivity.this, "Input null", Toast.LENGTH_LONG);
                } else {

                    int randomStart = Integer.parseInt(stringRandomStart);
                    int randomEnd = Integer.parseInt(stringRandomEnd);

                    Random random = new Random();
                    int res = randomStart + random.nextInt(randomEnd - randomStart);

                    txtResult.setText("" + res);
                    txtResult.setVisibility(View.VISIBLE);
                }
            }
        });

    }

}
