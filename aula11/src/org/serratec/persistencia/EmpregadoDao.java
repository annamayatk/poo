package org.serratec.persistencia;

import java.sql.Connection;

import org.serratec.conexao.ConnectionFactory;
import org.serratec.exemplos.Empregado;


public class EmpregadoDao {

	public EmpregadoDao() {
		Connection connection = new ConnectionFactory().getConnection();
	}
	
	public void inserir(Empregado empregado) {
		String sql = "insert into empregado(nome,profissao,salario) values(?,?,?)";
	}
	
	
}
