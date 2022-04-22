package com.mz.soto.junior._033_dia_da_semana;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		
		System.out.print("Digite o numero referente ao dia da semana: ");
		Integer diaDaSemana = teclado.nextInt();
		
		String dia;	
		switch(diaDaSemana) {
		case 1: dia = "Domingo";
			System.out.println("Vou a igreja");
			break;
		case 2: dia = "Segunda-feira";
			break;
		case 3: dia = "Terca-feira";
			break;
		case 4: dia = "Quarta-feira";
			break;
		case 5: dia = "Qinta-feira";
			break;
		case 6: dia = "Sexta-feira";
			break;	
		case 7: dia = "Sabado";
			break;	
			
		default: dia = "Dia da semana Invalido";	
		}
		
		System.out.println("O dia da semana escolhido foi: "+ dia);
	}

}
