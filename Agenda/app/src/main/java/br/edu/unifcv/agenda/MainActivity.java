package br.edu.unifcv.agenda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cursoradapter.widget.SimpleCursorAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;


public class MainActivity extends AppCompatActivity {


    private RecyclerView lista;
    private Context mContext;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.Recycler);
        Button botaoadd = findViewById(R.id.btnAdicionar);

        final ContatoMock mock = new ContatoMock(this);

        final List<Contato_Model> mContatos = mock.getmMockList();

         this.mContext = this;

        onClickViewListener onClickViewListener = new onClickViewListener() {
            @Override
            public void click(int id) {
                Bundle bundle = new Bundle();
                bundle.putInt(ContatoConstrants.Contato_ID,id);
                Intent i = new Intent(mContext, Contatos_Detalhes_Activity.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        };

        botaoadd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, InsereDados.class);
                startActivity(it);
            }
        });


        Contato_Adapter contato_Adapter = new Contato_Adapter(mContatos,onClickViewListener);
        lista.setAdapter(contato_Adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        lista.setLayoutManager(linearLayoutManager);



    }
    }


