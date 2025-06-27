package br.org.serratec;

public class Medico {
    protected String crm;
    protected String nome;
    protected Double salario;
    
    public Medico(String crm, String nome, Double salario) {
        this.crm = crm;
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Médico [CRM: " + crm + ", Nome: " + nome + ", Salário: " + salario + "]";
    }
    
    public String getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Double calcularSalario(){
        return salario = salario + salario * 1.05;
    }
    
    //overload = mesmo nome de metodo, com parametros diferentes
    public Double calcularSalario(Double valor){
        return salario = salario + salario * valor/100;
    }
    
}
