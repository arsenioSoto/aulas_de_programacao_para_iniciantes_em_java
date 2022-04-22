package com.mz.soto.junior._014_aplicar_desconto;

import java.util.Scanner;

public class AplicarDesconto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorDoProduto = teclado.nextDouble();
		
		System.out.print("Digite a quantidade do produto que deseja comprar: ");
		Integer quantidade = teclado.nextInt();
		
		Double valorSubtotal = valorDoProduto * quantidade;
		
		Boolean quantidadeMaiorQueDez = quantidade >= 10;
		
		Double descontoPercentual =  0.0;
		
		if(quantidadeMaiorQueDez) {
			descontoPercentual = 10.0;
		}
		
		Double desconto = valorSubtotal * descontoPercentual / 100;
		
		Double valorTotalComDesconto = valorSubtotal - desconto;
		
		System.out.println("Valor a pagar: " + valorTotalComDesconto);

	}

}
