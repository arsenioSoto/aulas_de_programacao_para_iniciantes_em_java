package com.mz.soto.junior._019_calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero e deve ser uma numero inteiro: ");
		Integer primeiroNumero = teclado.nextInt();
		
		System.out.print("Operacoes disponiveis: { 1 = + | 2 = - | 3 = * | 4 = / }: ");
		Integer operacao = teclado.nextInt();
		
		System.out.print("Digite o segundo numero e deve ser uma numero inteiro: ");
		Integer segundoNumero = teclado.nextInt();
		
		Integer resultado = null;
		
		if(operacao.equals(1)) {
			resultado = primeiroNumero + segundoNumero;
		}
		
		if(operacao.equals(2)) {
			resultado = primeiroNumero - segundoNumero;
		}
		
		if(operacao.equals(3)) {
			resultado = primeiroNumero * segundoNumero;
		}
		
		if(operacao.equals(4)) {
			resultado = primeiroNumero / segundoNumero;
		}
		
		
		System.out.println("Resultado: " + resultado);
	}

}
