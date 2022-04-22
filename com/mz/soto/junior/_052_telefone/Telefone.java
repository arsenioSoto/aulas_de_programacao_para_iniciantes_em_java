package com.mz.soto.junior._052_telefone;

public class Telefone {
	
	private String nome;
	private String modelo;
	private Double preco;
	private Double desconto;
	
	Double getTotalAPagar() {
		return preco - desconto;
	}
	
	void setTotalApagar(Double total) {
		//nao precisa do set
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	

}
