package com.mz.soto.junior._046_recursividade;

public class Recursividade {

	public static void main(String[] args) {
	String[] nomes = new String[] {"Arsenio", "Junior", "Soto"};
	
	listarNomes(nomes, 0);
		
	}
	
	static void listarNomes(String[] vetor, Integer i) {
		
			System.out.println(vetor[i]);
			
			if(++i < vetor.length) {
				listarNomes(vetor, i);
			}
		
	}
	

}
