package com.mz.soto.junior._021_calcular_produto_com_desconto;

import java.util.Scanner;

public class CobrarTaxa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorDoProduto = teclado.nextDouble();
		
		
		Boolean taxa = valorDoProduto < 50;
		
		Double valorFinal = valorDoProduto;
		
		if(taxa) {
			valorFinal += 5.0; //valorFinal = valorFinal + 5.0; operador de atribuicao
		}
		
		System.out.println("Valor a pagar: " + valorFinal);

	}

}
