package br.com.concessionaria.teste;

import br.com.concessionaria.dao.CarroDAO;
import br.com.concessionaria.factory.ConnectionFactory;
import br.com.concessionaria.model.Carro;

public class Teste {

	public static void main(String[] args) {
		
//		CarroDAO cdao = new CarroDAO();
//		Carro c = cdao.select(2);
//		
//		System.out.println("Nome do Carro   : " + c.getNome());
//		System.out.println("Modelo do Carro : " + c.getModelo());
		
		ConnectionFactory cf = new ConnectionFactory();
		
		cf.getConexao();
		
		
	}

}
