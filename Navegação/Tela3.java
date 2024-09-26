package com.example.kaykao_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tela3 extends AppCompatActivity {

    public int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        num = getIntent().getIntExtra("num", 0);
        atualizar();
    }

    public void menos(View view) {
        num--;
        atualizar();
    }

    public void mais(View view) {
        num++;
        atualizar();
    }

    public void atualizar() {
        TextView pontuacao = findViewById(R.id.txt_pontuacaoT3);
        pontuacao.setText(String.valueOf(num));
    }

    public void bt_voltart3(View view) {

        Intent in = new Intent(Tela3.this, Tela2.class);
        in.putExtra("num", num);
        startActivity(in);

    }
}