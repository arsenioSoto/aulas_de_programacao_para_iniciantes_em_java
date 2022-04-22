package com.mz.soto.junior._052_telefone;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		Telefone telefone = new Telefone();
		telefone.setNome("Motorola");
		telefone.setPreco(50.0);
		telefone.setDesconto(5.0);
		telefone.setModelo("Vodafone");
		
		Telefone tel = new Telefone();
		tel.setNome("Alcatel");
		tel.setPreco(1000.0);
		tel.setDesconto(10.0);
		tel.setModelo("Vodafone");
		
		
		System.out.println("Nome: "+ telefone.getNome() + " Preco: "+ telefone.getPreco() + " Modelo: " + telefone.getModelo() +
				" Desconto: " + telefone.getDesconto()+ " Total a pagar: "+ telefone.getTotalAPagar());
		
		
		System.out.println("Nome: "+ tel.getNome() + " Preco: "+ tel.getPreco() + " Modelo: " + tel.getModelo() +
				" Desconto: " + tel.getDesconto()+ " Total a pagar: "+ tel.getTotalAPagar());
		
	}

}
