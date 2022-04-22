package com.mz.soto.junior._020_operadores_relacionais;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		Boolean doisMaiorQueQuatro = 2 > 4;
		System.out.println("2 > 4? " + doisMaiorQueQuatro);
		
		Boolean doisMenorQueQuatro = 2 < 4;
		System.out.println("2 < 4? " + doisMenorQueQuatro);
		
		Boolean doisEIgualAQuatro = 2 == 4;
		System.out.println("2 == 4? " + doisEIgualAQuatro);
		
		Boolean doisMaiorOuIgualADois = 2 >= 2;
		System.out.println("2 >= 2? " + doisMaiorOuIgualADois);
		
		Boolean doisMenorOuIgualADois = 2 <= 2;
		System.out.println("2 <= 2? " + doisMenorOuIgualADois);
		
		Boolean doisDiferenteDeDois = 2 != 2;
		System.out.println("2 != 2? " + doisDiferenteDeDois);
		
		
		Integer dez = 10;
		Boolean dezIgualADez = dez.equals(dez);
		System.out.println(dezIgualADez);
		

	}

}
