package br.org.serratec;

import java.util.List;  //para poder usar o list

class Estado {
    String nomeEstado;
    String sigla;

    public Estado(String nomeEstado, String sigla) {
        this.nomeEstado = nomeEstado;
        this.sigla = sigla;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public String getSigla() {
        return sigla;
    } 
}

class Cidade {
    String nomeCidade;
    Estado estado;

    public Cidade(String nomeCidade, Estado estado) {
        this.nomeCidade = nomeCidade;
        this.estado = estado;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public Estado getEstado() {
        return estado;
    }
}

class Endereco {
   private String rua;
   private String bairro;
   private String cep;
   Cidade cidade;

   public Endereco(String rua, String bairro, String cep, Cidade cidade) {
    this.rua = rua;
    this.bairro = bairro;
    this.cep = cep;
    this.cidade = cidade;
   }

   public String getRua() {
    return rua;
   }

   public String getBairro() {
    return bairro;
   }

   public String getCep() {
    return cep;
   }

   public Cidade getCidade() {
    return cidade;
   }
}

class Telefone{
    String numero;

    public Telefone(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}

class Contato{
    String nome;
    List<Telefone> telefones;  //lista de telefones, para um contato poder ter mais de 1
    Endereco endereco;

    public Contato(String nome, List<Telefone> telefones, Endereco endereco) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public List<Telefone> getTelefones() {
        return telefones;
    }
    public Endereco getEndereco() {
        return endereco;
    }
}
