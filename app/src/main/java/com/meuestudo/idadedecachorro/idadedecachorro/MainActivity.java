package com.meuestudo.idadedecachorro.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = findViewById(R.id.campoIdadeID);
        botaoIdade = findViewById(R.id.botaoIdadeID);
        resultadoIdade = findViewById(R.id.textoIdadeID);



        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (caixaTexto.getText().toString().equals("") || caixaTexto.getText().toString().equals(null) || caixaTexto.getText().toString().isEmpty()){
                    resultadoIdade.setText("Digite uma idade válida!");
                }else{
                    int idade = Integer.parseInt(caixaTexto.getText().toString());
                    idade = idade * 7;
                    resultadoIdade.setText("A idade do cachorro em anos humanos é: " + idade);
                }
            }
        });






    }
}
