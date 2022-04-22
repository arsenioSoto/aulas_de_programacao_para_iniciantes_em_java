package com.mz.soto.junior._022_operador_de_atribuicao;

public class OperadorDeAtribuicao {

	public static void main(String[] args) {
		Double numeroSete = 7.0;
		
		//Double  numero = 4.0; 
		//Double res = numero + numeroSete; 
		//numeroSete = numeroSete + 3;
		
		numeroSete += 3;
		System.out.println("numeroSete + 3: " + numeroSete);
		
		
		numeroSete -= 3;
		System.out.println("numeroSete - 3: " + numeroSete);
		
		numeroSete *= 3;
		System.out.println("numeroSete * 3: " + numeroSete);
		
		
		numeroSete /= 3;
		System.out.println("numeroSete / 3: " + numeroSete);
		
		numeroSete %= 3;
		System.out.println("numeroSete % 3: " + numeroSete);
		
		
		

	}

}
