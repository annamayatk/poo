package br.org.serratec;

import java.util.List;  //para poder usar o list
import java.util.ArrayList; //para poder por um array na lista de telefones

public class Main {
    public static void main(String[] args) {
        Estado estadoMG = new Estado ("Minas Gerais", "MG");
        Cidade cidadeAraxa = new Cidade("Araxá", estadoMG);

        Endereco enderecoAraxa = new Endereco("Av Imbiara 1160", "Centro", "38183-244", cidadeAraxa);

        List<Telefone> telefones = new ArrayList<>();
        telefones.add(new Telefone("(34) 3661-5299"));
        telefones.add(new Telefone("(34) 3661-5280"));

        Contato contato = new Contato("Diogo Silva", telefones, enderecoAraxa);

        Endereco enderecoCompleto = contato.getEndereco();
        Cidade cidade = enderecoCompleto.getCidade();
        Estado estado = cidade.getEstado();

        System.out.println("nome: " + contato.getNome());
        System.out.printf("Endereço: %s %s %s %s  \n", enderecoCompleto.getRua(), enderecoCompleto.getBairro(), cidade.getNomeCidade(), estado.getNomeEstado());
        

        for (Telefone telefone : contato.getTelefones()) {
            System.out.println("Telefone: " + telefone.getNumero());
        }
    }
}
