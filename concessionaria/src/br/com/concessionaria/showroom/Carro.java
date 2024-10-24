package br.com.concessionaria.showroom;

import java.util.List;

import br.com.concessionaria.deptocomercial.Mecanico;
import br.com.concessionaria.deptocomercial.Vendedor;

public class Carro {

	private String nome;
	private String cor;
	private double preco;
	private String modelo;
	private int ano;
	private int id;
	private Vendedor vendedor;
	private Mecanico mecanico;
	private List<Carro> lista = null;

	public Carro() {
		

	}

	
	public Carro(String nome, String cor, double preco, String modelo, int ano, Vendedor vendedor, Mecanico mecanico) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.preco = preco;
		this.modelo = modelo;
		this.ano = ano;
		this.id = id;
		this.vendedor = vendedor;
		this.mecanico = mecanico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}
	
	public void imprimir() {
		System.out.println("Você escolheu o veículo " + this.nome + " de cor " + this.cor + " por R$ " + this.preco
				+ " modelo " + this.modelo + " do ano " + this.ano+".\nEstá correto?");
	}
	
	public void imprimirVenda() {
		System.out.println("Os dados do carro " + this.nome + " de cor " + this.cor + " por R$ " + this.preco
				+ " modelo " + this.modelo + " do ano " + this.ano+".\nEstão corretos?");
	}
	


}
