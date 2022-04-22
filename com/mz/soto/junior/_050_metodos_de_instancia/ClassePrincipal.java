package com.mz.soto.junior._050_metodos_de_instancia;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		MetodosDeInstancia cliente = new MetodosDeInstancia();
		cliente.nome = "Arsenio";
		cliente.apelido = "Soto";
		cliente.celular = "+2588450654";
		cliente.email = "Soto@gmail.com";
		
		MetodosDeInstancia cliente1 =  new MetodosDeInstancia();
		cliente1.nome = "Junior";
		cliente1.apelido = "Soto";
		cliente1.celular = "+2588450654";
		cliente1.email = "Junior@gmail.com";
		
		System.out.println("Nome Completo: " + cliente.mostrarNomeCompleto() + " email: "+ cliente.email());
		System.out.println("Nome Completo: " + cliente1.mostrarNomeCompleto() + " email: "+ cliente1.email());
	}

}
