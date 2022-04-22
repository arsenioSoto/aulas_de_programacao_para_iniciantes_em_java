package com.mz.soto.junior._051_encapsulamento;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		Cliente arsenio = new Cliente();
		
		arsenio.setNome("Arsenio");
		
		System.out.println("Nome: " + arsenio.getNome());

	}

}
