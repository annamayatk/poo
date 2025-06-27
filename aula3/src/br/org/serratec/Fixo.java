package br.org.serratec;

public class Fixo {
    double salarioBase;
    double comissao;
    double salarioBruto;
    Vendedor vendedor;
    
    public Fixo(double salarioBase, double comissao, Vendedor vendedor) {
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        this.vendedor = vendedor;
        this.salarioBruto = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    
    public void calcularSalario(double valorVenda) {
        salarioBruto = salarioBase + (valorVenda * comissao);
    }

    

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Vendedor: " + vendedor.getNome());
        System.out.println("CPF do Vendedor: " + vendedor.getCpf());
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Comissão: " + (comissao * 100) + "%");
        System.out.println("Salário Bruto: R$ " + salarioBruto);
    }
}
