package br.edu.unifcv.agenda;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Contatos_Detalhes_Activity extends AppCompatActivity {
    private Contato_Model mContatos;
    private TextView sobreNome_detalhe;
    private TextView endereco_detalhe;
    private TextView email_detalhe;
    private TextView referencia_detalhe;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contatos_detalhes_layout);

        this.sobreNome_detalhe = this.findViewById(R.id.sobreNome_detalhe);
        this.email_detalhe = this.findViewById(R.id.email_detalhe);
        this.referencia_detalhe = this.findViewById(R.id.referencia_detalhe);
        this.endereco_detalhe = this.findViewById(R.id.endereco_detalhe);


        Bundle bundle = getIntent().getExtras();

        ContatoMock mock = new ContatoMock(this);

        if (bundle != null) {
            this.mContatos = mock.getContato(bundle.getInt(ContatoConstrants.Contato_ID));
        }

        if (this.mContatos != null){
            this.sobreNome_detalhe.setText(this.mContatos.getSobreNome());
            this.endereco_detalhe.setText(this.mContatos.getEndereco());
            this.email_detalhe.setText((this.mContatos.getEmail()));
            this.referencia_detalhe.setText(this.mContatos.getReferencia());
        }
    }
}
