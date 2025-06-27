package br.org.serratec;

public class Vendedor {
    String nome;
    String cpf;

    public Vendedor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    } 
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
}
