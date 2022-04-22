package com.mz.soto.junior._006_tipo_texto;

import java.util.Scanner;

public class Texto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		
		Character sexo = '1';
		
		
		System.out.println("Chame-me " + nome + " sou do sexo " + sexo);

	}

}
