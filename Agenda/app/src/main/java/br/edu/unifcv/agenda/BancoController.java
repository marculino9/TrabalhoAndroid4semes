package br.edu.unifcv.agenda;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;

public class BancoController{
    private SQLiteDatabase db;
    private Contato_Banco banco;

    public BancoController(Context context){
        banco = new Contato_Banco(context);
    }

    public String insereDados(String nome, String sobrenome, String numero, String endereco, String email, String referencia){
        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(Contato_Banco.NUMERO,numero);
        valores.put(Contato_Banco.NOME, nome);
        valores.put(Contato_Banco.SOBRENOME, sobrenome);
        valores.put(Contato_Banco.ENDERECO,endereco);
        valores.put(Contato_Banco.EMAIL,email);
        valores.put(Contato_Banco.REFERENCIA, referencia);

        resultado = db.insert(Contato_Banco.TABELA, null, valores);
        db.close();

        if (resultado == -1) {
            return "Erro ao inserir registro";
        } else {
            return "SUCESSO";
        }
    }

    public Cursor carregaDados(){
        Cursor cursor;
        String[] campos =  {banco.NOME,banco.NUMERO};
        db = banco.getReadableDatabase();
        cursor = db.query(banco.TABELA, campos, null, null, null, null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;

}

    public Cursor carregaDadoById(int id){
        Cursor cursor;
        String[] campos =  {banco.NOME,banco.NUMERO,banco.SOBRENOME,banco.ENDERECO, banco.EMAIL, banco.REFERENCIA};
        String where = Contato_Banco.ID + "=" + id;
        db = banco.getReadableDatabase();
        cursor = db.query(Contato_Banco.TABELA,campos,where, null, null, null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }
    public void alteraRegistro(int id, String nome, String numero, String sobrenome, String endereco, String email, String referencia){
        ContentValues valores;
        String where;

        db = banco.getWritableDatabase();

        where = Contato_Banco.ID + "=" + id;

        valores = new ContentValues();
        valores.put(Contato_Banco.NOME, nome);
        valores.put(Contato_Banco.NUMERO, numero);
        valores.put(Contato_Banco.SOBRENOME, sobrenome);
        valores.put(Contato_Banco.ENDERECO,endereco);
        valores.put(Contato_Banco.EMAIL, email);
        valores.put(Contato_Banco.REFERENCIA,referencia);

        db.update(Contato_Banco.TABELA,valores,where,null);
        db.close();
    }

    public void deletaRegistro(int id){
        String where = Contato_Banco.ID + "=" + id;
        db = banco.getReadableDatabase();
        db.delete(Contato_Banco.TABELA,where,null);
        db.close();
    }

}

