package br.com.concessionaria.deptocomercial;

public class Comercial {
	
	private String nome;
	private String cargo;
	private int id;
	
	
	public Comercial() {}
	
	public Comercial(String nome, String cargo, int id) {
		this.nome = nome;
		this.cargo = cargo;
		this.id = id;
	}
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	
	
	
	
	
}
