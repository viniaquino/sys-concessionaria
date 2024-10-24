package br.com.concessionaria.deptofinanceiro;

import br.com.concessionaria.showroom.Carro;

public class Financeiro {
	
	
	private Carro carro;

	public Financeiro(Carro carro) {
		super();
		this.carro = carro;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	
	
}
