package com.mz.soto.junior._045_metodo_com_retorno;

public class MetodoComRetorno {

	public static void main(String[] args) {
		
		System.out.println(adicao(10.0, 7.0));
		System.out.println(imprimirNome("Arsenio Jose Soto Junior"));
	}
	
	static Double adicao(Double numero1, Double numero2) {
		Double resultado = numero1 + numero2;
		
		return resultado;
	}
	
	
	static String imprimirNome(String nome) {
		return nome;
	}

}
