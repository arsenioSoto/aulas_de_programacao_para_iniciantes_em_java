package com.mz.soto.junior._013_alterando_valor_de_uma_variavel;

import java.util.Scanner;

public class ValorAlterado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Valor do Produto: ");
		Double valorDoProduto = teclado.nextDouble();
		
		
		System.out.print("Digite o tipo de pagamento {1 = a vista ou 2 = a prazo}: ");
		Integer tipoPagamento = teclado.nextInt();
		
		Boolean pagamento = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		
		if (!pagamento) {
			juros = 10.0;
		}
		
		Double aumento = valorDoProduto * juros /100;
		Double valorTotal = aumento + valorDoProduto;
		
		System.out.println("Valor Total " + valorTotal);

	}

}
