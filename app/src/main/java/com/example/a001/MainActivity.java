package com.example.a001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button B1;
    Button B2;
    Button B3;
    Button B4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = findViewById(R.id.B1);
        B2 = findViewById(R.id.B2);
        B3 = findViewById(R.id.B3);
        B4 = findViewById(R.id.B4);
    }

    public void Travel1(View view) {
        Intent Cambio = new Intent(getApplicationContext(), AB1M1.class);
        startActivity(Cambio);

    }

    public void Travel2(View view) {
        Intent Cambio = new Intent(getApplicationContext(), AB1M1.class);
        startActivity(Cambio);
    }
    public void Travel3 (View view) {
        Intent Cambio = new Intent(getApplicationContext(), AB1M1.class);
        startActivity(Cambio);
    }
    public void Travel4 (View view) {
        Intent Cambio = new Intent(getApplicationContext(), AB1M1.class);
        startActivity(Cambio);
    }
    public void Salir (View view) {
        Intent salida = new Intent(Intent.ACTION_MAIN);
        salida.addCategory(Intent.CATEGORY_HOME);
        salida.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(salida);

    }
}
