package com.example.frasedodia;

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

    public void gerarNovasFrases(View view){

        String[] frase = {
                "E em nenhum outro há salvação, porque também debaixo do céu nenhum outro " +
                        "nome há, dado entre os homens, pelo qual devamos ser salvos.\n" +
                        "Atos 4:12",
                "Que nos salvou e chamou com uma santa vocação; não segundo as nossas obras, " +
                        "mas segundo o seu próprio propósito e graça que nos foi dada em " +
                        "Cristo Jesus, antes dos tempos dos séculos.\n" +
                        "2 Timóteo 1:9 ",
                "A minha alma espera somente em Deus;\n" +
                        "dele vem a minha salvação.\n" +
                        "Salmos 62:1 ",
                "E acontecerá que todo aquele que invocar o nome do Senhor será salvo.\n" +
                        "Atos 2:21"
        };
        int numero = new Random().nextInt(4);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText( frase[numero] );

    }

}