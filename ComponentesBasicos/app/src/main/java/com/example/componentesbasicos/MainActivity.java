package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText campoNome;
    EditText campoEmail;
    TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textResultado = findViewById(R.id.textResultado);
    }

    public void enviar(View view){//E obrigatorio colocar o view como parametro para pode pegar informações importantes
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        textResultado.setText(nome + " " + email);
    }

    public void limpar(View view){
    campoNome.setText("");
    campoEmail.setText("");
    }
}