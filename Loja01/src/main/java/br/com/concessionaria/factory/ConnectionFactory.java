package br.com.concessionaria.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection conexao = null;
	public static final String URL = "jdbc:mysql://localhost:3306/concessionaria?useSSL=false&serverTimezone=Etc/UTC";
	public static final String USUARIO = "root";
	public static final String SENHA = "";
	
	public Connection getConexao() {
		try {
			//Carregando o drive do JDBC no MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Estabelecendo a conexão com o BANCO DE DADOS
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA); 
			System.out.println("CONEXÃO ESTABELECIDA COM SUCESSO!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVE JDBC não encontrado!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Erro ao conectar com o Banco!");
			e.printStackTrace();
		}
		
		return conexao;
	}
	
}
