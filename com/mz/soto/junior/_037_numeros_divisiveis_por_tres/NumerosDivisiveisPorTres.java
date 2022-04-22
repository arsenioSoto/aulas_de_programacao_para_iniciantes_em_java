package com.mz.soto.junior._037_numeros_divisiveis_por_tres;

public class NumerosDivisiveisPorTres {

	static final Integer DIVISOR = 3;
	public static void main(String[] args) {
		
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		int i = 0;
		
		while(i < numeros.length) {
			Integer numero = numeros[i];
			Integer divisivelPorTres = numero % DIVISOR;
			
			
			if(divisivelPorTres.equals(0)) {
				System.out.println("Numero: "+ numero + " eh divisivel por tres " );
			}
			
			i++;
		}
		
		System.out.println("Terminei");
	}

}
