package br.edu.unifcv.agenda;

public class Contato_Model {
    private int id;
    private String nome;
    private String sobreNome;
    private String numero;
    private String endereco;
    private String email;
    private String referencia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contato_Model (int id,String nome, String numero, String sobreNome, String email, String endereco, String referencia){
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.sobreNome = sobreNome;
        this.email = email;
        this.endereco = endereco;
        this.referencia = referencia;
    }
}
