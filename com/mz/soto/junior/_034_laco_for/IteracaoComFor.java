package com.mz.soto.junior._034_laco_for;

public class IteracaoComFor {

	public static void main(String[] args) {
		
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(i);
//		}
		
//		Double[] valoresDeProdutos = new Double[]{25.0, 25.0, 50.0};
//		Double total = 0.0;
//		
//		for(int i = 0; i < valoresDeProdutos.length; i++) {
//			System.out.println("Iteracao: " + i + ", Total: " + total);
//			total += valoresDeProdutos[i]; //total = total + [0]  = 25.0
//		}
//		
//		System.out.println("Total: "+ total);
		
//		for (int i = 0; i < 10; i++) {
//			if(i==5) {
//				System.out.println("Continua!");
//				//break;
//				continue;
//			}
//			
//			System.out.println( i);
		
		Integer[] produtos = new Integer[] {10, 20, 30};
		
		for(int i = 0; i < produtos.length; i++) {
			Integer produto = produtos[i];
			
			System.out.println("Precos de produto: " + produto);
			
			if(produto.equals(10)) {
				System.out.println("Produto encontrado!");
				break;
			}
		}
	}
}
