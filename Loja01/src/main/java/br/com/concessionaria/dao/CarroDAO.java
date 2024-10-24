package br.com.concessionaria.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import br.com.concessionaria.model.Carro;

public class CarroDAO {
	
	public static List<Carro> banco = null;
	
	public CarroDAO() {
		
		if(banco == null) {
			banco = new ArrayList<Carro>();
			
			Carro carro = new Carro();
			
			carro.setModelo("SUV");
			carro.setNome("Renegade");
			carro.setCor("Prata");
			carro.setAno(2022);
			carro.setPreco(87.000);
			carro.setId(1);
			banco.add(carro);
			
			//CARRO 2
			carro = new Carro();
			
			carro.setModelo("SEDAN");
			carro.setNome("Onix");
			carro.setCor("Azul Royal");
			carro.setAno(2024);
			carro.setPreco(105.000);
			carro.setId(2);
			banco.add(carro);
			
			//CARRO 3
			carro = new Carro();
			
			carro.setModelo("Hatch");
			carro.setNome("i30");
			carro.setCor("Preto");
			carro.setAno(2012);
			carro.setPreco(53.000);
			carro.setId(3);
			banco.add(carro);
			
			//CARRO 4
			carro = new Carro();
			
			carro.setModelo("SEDAN");
			carro.setNome("Civic");
			carro.setCor("Prata");
			carro.setAno(2000);
			carro.setPreco(15.000);
			carro.setId(4);
			banco.add(carro);
			
		}
		
		
	}
	public List<Carro> select(){
		return banco;
	}
	public Carro select(int id){
		for (int i = 0; i < banco.size(); i++) {
			if(banco.get(i).getId() == id) {
				return banco.get(i);
			}
		}
		return null;
	
	}
}