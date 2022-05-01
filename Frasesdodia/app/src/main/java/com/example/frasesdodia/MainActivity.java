package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void randomPhase(View view){
        TextView phrase = findViewById(R.id.phrase);

        String[] phrases = {"frase 1", "frase 2", "frase 3", "frase 4"};

        int numPhrase = new Random().nextInt(3);

        phrase.setText(phrases[numPhrase]);
    }
}