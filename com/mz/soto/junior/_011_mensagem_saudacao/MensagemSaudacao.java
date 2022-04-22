package com.mz.soto.junior._011_mensagem_saudacao;

import java.util.Scanner;

public class MensagemSaudacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Digite o sua nome: ");
		String nome = teclado.nextLine();
		
		System.out.println("Digite o seu apelido: ");
		String apelido = teclado.nextLine();
		
		
		System.out.println("oi tudo bem " + nome + " " + apelido + " ?");

	}

}
