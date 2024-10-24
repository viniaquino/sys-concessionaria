package br.com.concessionaria.teste;

import java.util.List;

import br.com.concessionaria.dao.CarroDAO;
import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.deptocomercial.Vendedor;
import br.com.concessionaria.showroom.Carro;

public class Teste2 {

	public static void main(String[] args) {

//		Carro carro[] = new Carro[3];
//
//		carro[0] = new Carro();
//		carro[1] = new Carro();
//		carro[2] = new Carro();
//
//		carro[0].setNome("Fiesta");
//		carro[1].setNome("Civic");
//		carro[2].setNome("Lancer");
//		
//		for (Carro carro2 : carro) {
//			System.out.println("Nome do carro : " + carro2.getNome());
//		}
//		
		//Exercício:
		//Crie um array de mecânicos com 5 mecânicos e imprima:
		
//		Mecanico mecanico[] = new Mecanico[5];
//		mecanico[0] = new Mecanico();
//		mecanico[1] = new Mecanico();
//		mecanico[2] = new Mecanico();
//		mecanico[3] = new Mecanico();
//		mecanico[4] = new Mecanico();
//		
//		mecanico[0].setNome("Jorge");
//		mecanico[1].setNome("Arnaldo");
//		mecanico[2].setNome("Airton");
//		mecanico[3].setNome("Plinio");
//		mecanico[4].setNome("João");
//		
//		//através do foreach:
//		for (Mecanico mecanico2 : mecanico) {
//			System.out.println("O nome do mecanico que te atendeu foi : " + mecanico2.getNome());
//		}
//		
//		int nrLinhas = 21;
//		int nrColunas = 4;
//		
//		
//		String[][] assentos = new String[nrLinhas][nrColunas];
//		for (int x = 0; x < assentos.length ; x++) {
//			for(int i = 0; i < nrColunas ; i++) {
//				assentos[x][i] = "O";
//				
//			}
//			
//		}
//		for (int x = 0; x < assentos.length ; x++) {
//			for(int i = 0; i < nrColunas ; i++) {
//				if(i == 2) {
//					System.out.print("-");
//				}
//				System.out.print("["+ assentos[x][i] +"]");
//			}
//			System.out.println("");
//		}
//				
//	}
		
//		Vendedor vendedor = new Vendedor();
//		
//		vendedor.setCargo("Gerente");
//		vendedor.setId(12345);
//		vendedor.setNome("Jonas");
//		
//		Mecanico mecanico = new Mecanico();
//		mecanico.setCargo("Supervisor");
//		mecanico.setId(213);
//		mecanico.setNome("Joaquim");
//		
//		Carro carro = new Carro();
//		carro.setAno(2021);
//		carro.setCor("Prata");
//		carro.setMecanico(mecanico);
//		carro.setModelo("Coupe");
//		carro.setNome("Miura");
//		carro.setPreco(87.987);
//		carro.setVendedor(vendedor);
//		
////		if(carro.insertCarro) {
////			vendedor.getLista(vendedor);
////		}else {
////			throw new NullPointerException();
////		}
////		Carro carro = vendedor.getCarroById(vendedor.getCarroByName("Astra"));
//		
//		
		
		
		CarroDAO cdao = new CarroDAO();
		
		Carro carro = cdao.select(2);
		
		Carro car = new Carro();
		car.setNome("Tesla");
		car.setAno(2010);
		car.setCor("Preto");
		System.out.println(carro.getNome());
		cdao.insert(car);
		
		cdao.delete(car);
		
		List<Carro> lista = cdao.select();
		
		
		
		for (Carro carro2 : lista) {
			System.out.println("Ano " + carro2.getAno());
			System.out.println("Nome " + carro2.getNome());
			System.out.println("Cor " + carro2.getCor());
			System.out.println("Modelo " + carro2.getModelo());
			System.out.println("Id " + carro2.getId());
			System.out.println("Preço " + carro2.getPreco());
			
			System.out.println();
		}
		
		
		Carro carro3 = cdao.select(3);
		carro3.imprimir();
		
		carro3.setAno(1990);
		carro3.setCor("Preto");
		carro3.setPreco(31.987);
		
		if(cdao.update(carro3.getId(), carro3)) {
			
			carro3.imprimir();
		}else {
			System.out.println("Ocorreu um erro durante a atualização!");
		}
		
	}
	
}
