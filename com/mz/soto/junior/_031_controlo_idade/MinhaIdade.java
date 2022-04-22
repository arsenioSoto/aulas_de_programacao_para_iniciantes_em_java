package com.mz.soto.junior._031_controlo_idade;

import java.util.Scanner;

public class MinhaIdade {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Ano atual: ");
		Integer anoAtual = teclado.nextInt();
		
		System.out.print("Ano de Nascimento: ");
		Integer anoDeNascimento = teclado.nextInt();
		
		
		Integer idade = anoAtual - anoDeNascimento;
		
		System.out.println("Idade: " + idade);
		
		
		if(idade < 5) {
			System.out.println("Bebe!");
		}else if(idade > 4 && idade < 13) {
			System.out.println("Crianca!");
		}else if(idade > 12 && idade < 18) {
			System.out.println("Pre-Adolescente!");
		}else if(idade > 17 && idade < 27) {
			System.out.println("Adolescente!");
		}else if(idade > 26 && idade < 60) {
			System.out.println("Adulto!");
		}else if(idade > 59) {
			System.out.println("Idoso!");
		}

	}

}
