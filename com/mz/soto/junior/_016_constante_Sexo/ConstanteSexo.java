package com.mz.soto.junior._016_constante_Sexo;

import java.util.Scanner;

public class ConstanteSexo {

	static final Character SEXO_DE_UMA_PESSOA = 'M'; //M -> Msculino      F-> Feminino
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		Character sexo = 'F';
		
		Boolean sexoMasculinoOuFeminino = sexo.equals(SEXO_DE_UMA_PESSOA);
		
		if(sexoMasculinoOuFeminino) {
			System.out.println("O teu sexo eh Masculino");
		} else {
			System.out.println("O seu sexo eh Feminino");
		}
	}

}
