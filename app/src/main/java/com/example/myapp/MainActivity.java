package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnImc, btnCombustivel, btnApresentacao, btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciando os botões
        btnImc = findViewById(R.id.btnImc);
        btnCombustivel = findViewById(R.id.btnCombustivel);
        btnApresentacao = findViewById(R.id.btnApresentacao);
        btnFechar = findViewById(R.id.btnFechar);

        // Ações dos botões
        btnImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculadoraIMCActivity.class);
                startActivity(intent);
            }
        });

        btnCombustivel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculadoraCombustivelActivity.class);
                startActivity(intent);
            }
        });

        btnApresentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ApresentacaoActivity.class);
                startActivity(intent);
            }
        });

        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Fecha o aplicativo
            }
        });
    }
}
