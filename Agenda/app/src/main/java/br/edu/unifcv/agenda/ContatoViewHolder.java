package br.edu.unifcv.agenda;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContatoViewHolder extends RecyclerView.ViewHolder {
    TextView mTxtNome;
    TextView mTxtNumero;

    public ContatoViewHolder(@NonNull View itemView) {
        super(itemView);
        this.mTxtNome = itemView.findViewById(R.id.nome_inicial);
        this.mTxtNumero = itemView.findViewById(R.id.numero_inicial);

    }


    public  void bindData(final Contato_Model contato_model, final onClickViewListener mOnClickViewListener) {
        this.mTxtNome.setText(contato_model.getNome());
        this.mTxtNumero.setText(contato_model.getNumero());

        this.mTxtNome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              mOnClickViewListener.click(contato_model.getId());
            }
        });
    }
}
