package br.org.serratec;

public class Imovel {
    private String tipo;
    private Double valor;
    private Proprietario proprietario;
    
    public Imovel(String tipo, Double valor, Proprietario proprietario) {
        this.tipo = tipo;
        this.valor = valor;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Imóvel [tipo: " + tipo + ", valor: " + valor + ", proprietário: " + proprietario + "]";
    }

    public String getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

   
}
