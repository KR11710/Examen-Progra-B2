package com.example.a001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class AB1M2 extends AppCompatActivity {

    Button RPM1;
    TextView NS;
    TextView AS;
    TextView SS;
    TextView IGSS;
    TextView INTECAP;
    TextView IRTRA;
    TextView ISR;
    TextView BONIFICACIONES;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab1_m2);

        RPM1 = findViewById(R.id.RPM1);
        NS = findViewById(R.id.NS);
        AS = findViewById(R.id.AS);
        SS = findViewById(R.id.SS);
        IGSS = findViewById(R.id.IGSS);
        INTECAP = findViewById(R.id.INTECAP);
        IRTRA = findViewById(R.id.IRTRA);
        ISR = findViewById(R.id.ISR);
        BONIFICACIONES = findViewById(R.id.BONIFICACIONES);

        String NE = getIntent().getStringExtra("NE");
        String AE = getIntent().getStringExtra("AE");
        String SE = getIntent().getStringExtra("SE");
        NS.setText(NE);
        AS.setText(AE);
        SS.setText(SE);

        double SS = Double.parseDouble(SE);
        double igss = (SS * 4.83) / 100;
        double irtra = (SS * 1) / 100;
        double intecap = (SS * 1) / 100;
        double isr;


        if (SS > 5000) {
            isr = ((SS * 5) / 100);
        } else {
            isr = 0;
        }
        double total = (SS - igss - irtra - intecap - isr);


        String IGSS1 = String.valueOf(igss);
        String ISTRA1 = String.valueOf(irtra);
        String INTECAP1 = String.valueOf(intecap);
        String ISR1 = String.valueOf(isr);
        IGSS.setText(IGSS1);
        IRTRA.setText(ISTRA1);
        INTECAP.setText(INTECAP1);
        ISR.setText(ISR1);
    }
    public void comeback1 (View view) {
        Intent Regreso = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(Regreso);
    }
    }
