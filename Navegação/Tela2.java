package com.example.kaykao_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    public int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
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
        TextView pontuacao = findViewById(R.id.txt_pontuacaoT2);
        pontuacao.setText(String.valueOf(num));
    }

    public void bt_avancarT2(View view) {

        Intent in = new Intent(Tela2.this, Tela3.class);
        in.putExtra("num", num);
        startActivity(in);

    }

    public void bt_voltarT2(View view) {

        Intent in = new Intent(Tela2.this, MainActivity.class);
        in.putExtra("num", num);
        startActivity(in);

    }
}