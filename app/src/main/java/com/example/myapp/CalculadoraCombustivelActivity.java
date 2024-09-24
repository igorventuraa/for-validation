package com.example.myapp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraCombustivelActivity extends AppCompatActivity {
    EditText edtGasolina, edtAlcool;
    RadioGroup rgCombustivel;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_combustivel);

        edtGasolina = findViewById(R.id.edtGasolina);
        edtAlcool = findViewById(R.id.edtAlcool);
        rgCombustivel = findViewById(R.id.rgCombustivel);
        txtResultado = findViewById(R.id.txtResultado);

        rgCombustivel.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                double gasolina = Double.parseDouble(edtGasolina.getText().toString());
                double alcool = Double.parseDouble(edtAlcool.getText().toString());

                double relacao = alcool / gasolina;
                String recomendacao;

                if (checkedId == R.id.rbAlcool) {
                    recomendacao = relacao < 0.7 ? "Álcool é mais vantajoso" : "Gasolina é mais vantajosa";
                    double diferenca = Math.abs(0.7 - relacao) * 100;
                    txtResultado.setText(recomendacao + "\nDiferença de " + String.format("%.2f", diferenca) + "%.");
                } else if (checkedId == R.id.rbGasolina) {
                    recomendacao = relacao >= 0.7 ? "Gasolina é mais vantajosa" : "Álcool é mais vantajoso";
                    double diferenca = Math.abs(0.7 - relacao) * 100;
                    txtResultado.setText(recomendacao + "\nDiferença de " + String.format("%.2f", diferenca) + "%.");
                }
            }
        });
    }
}
