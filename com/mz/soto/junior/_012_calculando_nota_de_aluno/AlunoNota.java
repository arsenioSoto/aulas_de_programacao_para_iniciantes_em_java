package com.mz.soto.junior._012_calculando_nota_de_aluno;

import java.util.Scanner;

// se aprovou ou reprovou
public class AlunoNota {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nomeDoAluno = teclado.nextLine();
		
		
		System.out.print("Digite a sua nota: ");
		Double notaDoAluno = teclado.nextDouble();
		
				//true se for verdade
		Boolean alunoPassouDeAno = notaDoAluno >= 9.5;
				//false 
		
		if (alunoPassouDeAno) {
			//
			System.out.println("O Aluno " + nomeDoAluno + " Aprovou com nota " + notaDoAluno);
			//
		} else {
			System.out.println("O Aluno " + nomeDoAluno + " Reprovou com nota " + notaDoAluno);
		}
		
	}

}
