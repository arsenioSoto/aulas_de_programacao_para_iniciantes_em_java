package com.mz.soto.junior._059_enviar_lista_de_alunos;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class Enviador {

	public static void main(String[] args) throws EmailException {
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		String alunos;
		
		int i = 0;
		
		while(true) {
			System.out.println("Aluno: " + i + ": ");
			alunos = teclado.nextLine();
			
			
			if("X".equals(alunos)) {
				break;
			}
			
			linhas.add(alunos);
			i++;
		}
		
		String aluno = " ";
		for(int x = 0; x < linhas.size(); x++) {
			aluno += linhas.get(x);
		}
		
		String mensagem = "Os seus Alunos: \n" + aluno;
		
		System.out.print("Digite o email do destinatario: ");
		String para = teclado.next();
		
		ListaDeAlunosEmail.enviar(para, "A sua lista de Alunos", mensagem);
		
		System.out.println("Terminei");

	}

}
