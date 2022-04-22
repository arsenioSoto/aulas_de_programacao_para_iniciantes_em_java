package com.mz.soto.junior._032_estrutura_switch;

import java.util.Scanner;

public class SeuMes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o numero do seu mes: ");
		Integer mes = teclado.nextInt();
		
		
		String nomeDomes = "";
		
//		if(mes.equals(1)) {
//			nomeDomes = "Janeiro";
//		} else if(mes.equals(2)) {
//			nomeDomes = "Fevereiro";
//		}
//
		
		switch(mes) {
		case 1: nomeDomes = "Janeiro"; //arsenio
			break;
		
		case 2: nomeDomes = "Fevereiro";
			break;
		
		case 3: nomeDomes = "Marco";
			break;
		
		case 4: nomeDomes = "Abril";
			break;
		
		case 5: nomeDomes = "Maio";
			break;
		
		case 6: nomeDomes = "Junho";
			break;
		
		case 7: nomeDomes = "Julho";
			break;
		
		case 8: nomeDomes = "Agosto";
			break;
		
		case 9: nomeDomes = "Setembro";
			break;
		
		case 10: nomeDomes = "Outubro";
			break;
		
		case 11: nomeDomes = "Novembro";
			break;
		
		case 12: nomeDomes = "Dezembro";
			break;
		
		default:
			System.out.println("Digite um mes valido!");
			System.exit(1);
		}
		System.out.println("Mes de " + nomeDomes);
		System.out.println("Feliz aniversario!");
		
	}

}
