package com.example.myapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ApresentacaoActivity extends AppCompatActivity {
    TextView txtApresentacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apresentacao);

        txtApresentacao = findViewById(R.id.txtApresentacao);

        // Exemplo de apresentação de dados do aluno
        String dadosAluno = "Nome: Igor Ventura\nCurso: ADS\nMatrícula: 33438200\nSemestre: 4º\nDisciplina: Programação Android";
        txtApresentacao.setText(dadosAluno);
    }
}
