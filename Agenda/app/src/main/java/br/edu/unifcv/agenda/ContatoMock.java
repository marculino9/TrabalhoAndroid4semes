package br.edu.unifcv.agenda;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ContatoMock {
    private List<Contato_Model> mMockList;

    public ContatoMock(Activity activity){
        mMockList = new ArrayList<>();
        int id = 0;
        Contato_Model PessoaUM = new Contato_Model(id ,
                "Nome: "+"Maria",
                "Número: "+"98562348",
                "SobreNome: "+"Silva",
                "E-mail "+"Maria@email.com",
                "Endereço: "+"Rua das flores",
                "Referencia: "+"prima");
        mMockList.add(PessoaUM);
        Contato_Model PessoaDOIS = new Contato_Model(id ,
                "Nome: "+"José",
                "Número: "+"85241674",
                "SobreNome: "+"Rodrigues",
                "E-mail: "+"Jose@email.com",
                "Endereço: "+"Rua das flores",
                "Referencia: "+"pai");
        mMockList.add(PessoaDOIS);


    }
    public List<Contato_Model> getmMockList(){
        return this.mMockList;
    }
    public Contato_Model getContato(int index){
        return mMockList.get(index);
    }

}
