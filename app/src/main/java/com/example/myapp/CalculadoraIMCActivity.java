package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraIMCActivity extends AppCompatActivity {
    EditText edtPeso, edtAltura;
    Button btnCalcular, btnLimpar;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_imc);

        edtPeso = findViewById(R.id.edtPeso);
        edtAltura = findViewById(R.id.edtAltura);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnLimpar = findViewById(R.id.btnLimpar);
        txtResultado = findViewById(R.id.txtResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double peso = Double.parseDouble(edtPeso.getText().toString());
                double altura = Double.parseDouble(edtAltura.getText().toString());
                double imc = peso / (altura * altura);
                String classificacao = getClassificacaoIMC(imc);
                txtResultado.setText("IMC: " + String.format("%.2f", imc) + "\nClassificação: " + classificacao);
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtPeso.setText("");
                edtAltura.setText("");
                txtResultado.setText("");
            }
        });
    }

    private String getClassificacaoIMC(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc >= 18.5 && imc < 24.9) return "Peso normal";
        else if (imc >= 25 && imc < 29.9) return "Sobrepeso";
        else return "Obesidade";
    }
}
