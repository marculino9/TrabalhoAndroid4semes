package br.edu.unifcv.agenda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsereDados extends Activity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insere_dados);

        Button btnsalvar = (Button)findViewById(R.id.button_cad);
        Button btnvoltar = (Button) findViewById(R.id.button_voltar);

        btnsalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());
                EditText nome = (EditText)findViewById(R.id.nome_edit);
                EditText sobrenome = (EditText)findViewById((R.id.sobrenome_edit));
                EditText numero = (EditText)findViewById(R.id.numero_edit);
                EditText endereco = (EditText)findViewById(R.id.endereço_edit);
                EditText email= (EditText)findViewById(R.id.email_edit);
                EditText referencia = (EditText)findViewById(R.id.referencia_edit);

                String nomeString = nome.getText().toString();
                String sobrenomeString = sobrenome.getText().toString();
                String numeroString = numero.getText().toString();
                String enderecoString = endereco.getText().toString();
                String emailString = email.getText().toString();
                String referenciaString = referencia.getText().toString();
                String resultado;

                resultado = crud.insereDados(nomeString, sobrenomeString, numeroString, enderecoString, emailString, referenciaString);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });
        btnvoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(InsereDados.this, MainActivity.class);
                startActivity(it);
            }
        });
    };
}

