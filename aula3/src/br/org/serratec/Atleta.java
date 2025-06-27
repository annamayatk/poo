package br.org.serratec;

public class Atleta {
    private String nome;
    private Integer idade;
    
    public Atleta(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Atleta [nome: " + nome + ", idade: " + idade + "]";
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    
}
