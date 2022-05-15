package com.example.a001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AB1M1 extends AppCompatActivity {
    Button BA1M1;
    EditText NE;
    EditText AE;
    EditText SE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab1_m1);

        BA1M1 = findViewById(R.id.BA1M1);
           NE = findViewById(R.id.NE);
           AE = findViewById(R.id.AE);
           SE = findViewById(R.id.SE);
    }
    public void Calculo (View view) {
        Intent Calculo = new Intent(getApplicationContext(), AB1M2.class);
        Calculo.putExtra("NE", NE.getText().toString());
        Calculo.putExtra("AE", AE.getText().toString());
        Calculo.putExtra("SE", SE.getText().toString());
        startActivity(Calculo);

    }
}

