package com.example.kaykao_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        TextView pontuacao = findViewById(R.id.txt_pontuacaoTP);
        pontuacao.setText(String.valueOf(num));
    }

    public void bt_avancarTP(View view) {

        Intent in = new Intent(MainActivity.this, Tela2.class);
        in.putExtra("num", num);
        startActivity(in);

    }
}