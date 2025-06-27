package br.org.serratec;

public class FreeLancer {
    Integer diasTrabalhados;
    double valorDia;
    Vendedor vendedor;

    public FreeLancer(Integer diasTrabalhados, double valorDia, Vendedor vendedor) {
        this.diasTrabalhados = diasTrabalhados;
        this.valorDia = valorDia;
        this.vendedor = vendedor;
    }
    public Integer getDiasTrabalhados() {
        return diasTrabalhados;
    }
    public void setDiasTrabalhados(Integer diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }
    public double getValorDia() {
        return valorDia;
    }
    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }
    public String getNomeVendedor() {
        return vendedor.getNome();
    }

    public String getCpfVendedor() {
        return vendedor.getCpf();
    }
}
