package com.mz.soto.junior._001_calcularidade;

import java.util.Scanner;

public class CalcularIdade {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o ano atual: ");
		Integer anoAtual = scanner.nextInt();
		
		System.out.print("Digite o ano de nascimento: ");
		Integer anoNascimento = scanner.nextInt();
		
		Integer idade = anoAtual - anoNascimento;
		
		System.out.println("A sua idade eh: " + idade);
		
	
	}
}
