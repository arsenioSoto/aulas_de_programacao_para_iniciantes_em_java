package com.mz.soto.junior._028_estrutura_de_decisao_if_simples;

import java.util.Scanner;

public class EstruturaDeDecisaoIf {

	static final Integer MAIOR_IDADE = 18;
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o ano atual: ");
		Integer anoAtual = teclado.nextInt();
		
		
		System.out.print("Digite o ano de nascimento: ");
		Integer anoDeNascimento = teclado.nextInt();
		
		
		Integer idade = anoAtual - anoDeNascimento;
		
		Boolean maiorDeIdade = idade >= MAIOR_IDADE;
		
		System.out.println("Idade: " + idade);
		
		if(maiorDeIdade) {
			System.out.println("Maior de idade!");
		}else {
			System.out.println("Menor de idade!");
		}
	}

}
