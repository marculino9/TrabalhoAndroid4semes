package br.edu.unifcv.agenda;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Contato_Adapter extends RecyclerView.Adapter<ContatoViewHolder> {
    private List<Contato_Model> mContatos;
    private onClickViewListener mOnClickViewListener;

    public Contato_Adapter(List<Contato_Model> mContatos,onClickViewListener onClickViewListener){
        this.mContatos = mContatos;
        this.mOnClickViewListener = onClickViewListener;
    }

    @NonNull
    @Override
    public ContatoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.contato_inicial ,viewGroup,false);

       return new ContatoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContatoViewHolder holder, int i) {
        holder.bindData(this.mContatos.get(i), mOnClickViewListener);
    }

    @Override
    public int getItemCount() {
        return mContatos.size();
    }
}
