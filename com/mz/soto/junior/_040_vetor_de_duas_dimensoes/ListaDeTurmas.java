package com.mz.soto.junior._040_vetor_de_duas_dimensoes;

public class ListaDeTurmas {

	public static void main(String[] args) {
		
		String[] alunosDaTurma1 = new String[] {"Arsenio", "Junior", "Soto"};
		String[] alunosDaTurma2 = new String[] {"Jose", "Djapela", "Djudjudju"};
		
		String[][] turmaUnica = new String[][] {alunosDaTurma1, alunosDaTurma2};
		
//		System.out.println("Aluno na posicao 1 "+ turmaUnica[0][1]);
//		System.out.println("Aluno na posicao 2 "+ turmaUnica[1][2]);
		
		for(int i = 0; i < turmaUnica.length; i++) {
			System.out.println("Turma "+ (i+1));
			
			String[] nomes = turmaUnica[i];
		
		
		for(int x = 0; x < nomes.length; x++) {
				String nome = nomes[x];
				System.out.println((x+1) + ": " + nome);
			}
		}

	}

}
