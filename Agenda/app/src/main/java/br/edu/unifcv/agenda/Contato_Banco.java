package br.edu.unifcv.agenda;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class Contato_Banco extends SQLiteOpenHelper {
    private static final String NOME_BANCO = "contatos_____.db";
    static final String TABELA = "Contatos";
    protected static final String ID = "_id";
    static final String NOME = "nome";
    static final String NUMERO = "numero";
    static final String SOBRENOME = "sobrenome";
    static final String ENDERECO = "endereco";
    static final String EMAIL = "email";
    static final String REFERENCIA = "referencia";
    private static final int VERSAO = 1;

    public Contato_Banco(@Nullable Context context) {
        super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       String sql = "CREATE TABLE " + TABELA + "(" + ID + " INTEGER PRIMARY KEY autoincrement," + NUMERO + " integer NOT NULL, " + NOME + " text NOT NULL, " + SOBRENOME + " text, " + ENDERECO + " text, " +
                EMAIL + " text, " + REFERENCIA + " text " + ")";

        db.execSQL(sql);
        }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Contatos" + TABELA);
        onCreate(db);
    }
}
