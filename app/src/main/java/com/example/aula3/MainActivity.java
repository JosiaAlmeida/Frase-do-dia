package com.example.aula3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textphrase);
    }

    public void gerateWord(View view){
        Random r = new Random();
        String listphrase[] = {
                "Aqueles que não conseguirem se reconhecer vão falhar",
                "Você não é perfeito, você comete erros e fica mais fortes por causa deles",
                "A dor é inevitavel, o sofrimento é opcional",
                "Sentimentos são apenas emoções faceis de manipular",
                "As 7 maravilhas do mundo encontrei em ti",
                "Não preciso de muito, apenas quero ver o seu sorriso",
                "Seus pais são grandes artitas, Você é a melhor obra artistica deles",
                "Onde existe amor, sempre haverá odio",
                "Você é fraco, te falta odio",
                "A primeira derrota começa na mente"};
        int i = r.nextInt(listphrase.length);
        txt.setText(listphrase[i]);
    }
}