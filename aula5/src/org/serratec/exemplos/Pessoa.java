package org.serratec.exemplos;

public class Pessoa implements Tributos {
	private String nome;
    private Double rendimentos;

    public Pessoa(String nome, Double rendimentos) {
        this.nome = nome;
        this.rendimentos = rendimentos;
    }

    @Override
    public String toString() {
        return "Pessoa" +
                ", nome: " + this.getNome() +
                ", rendimentos: " + this.getRendimentos();
    }

    public String getNome() {
        return nome;
    }

    public Double getRendimentos() {
        return rendimentos;
    }

    @Override
    public Double calcularICMS() {
        return rendimentos * IRPESSOAFISICA;
    }

    @Override
    public Double calcularIR() {
        return 0.0;
    }
	
	
}
