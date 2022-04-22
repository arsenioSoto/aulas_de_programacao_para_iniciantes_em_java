package com.mz.soto.junior._050_metodos_de_instancia;

public class MetodosDeInstancia {
	//Cliente
	
	String nome;
	String apelido;
	String celular;
	String email;
	
	
	 String mostrarNomeCompleto() {
		String nomeCompleto = nome + " " + apelido;
		
		return nomeCompleto;
	}
	
	
	String email() {
		String gmail = email.substring(0, 4);
		
		return gmail;
	}

}
