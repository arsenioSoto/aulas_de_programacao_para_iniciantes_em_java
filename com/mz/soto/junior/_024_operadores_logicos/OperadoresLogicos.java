package com.mz.soto.junior._024_operadores_logicos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Boolean casado = true;
		Boolean destino = false;
		Boolean temDinheiro = true;
		Boolean idadeMaiorQueVinte = true;
		Boolean temVeiculo = true;
		
		
		// &&
		Boolean cinema = casado && temVeiculo;
		//se
		if(cinema) {
			System.out.println("Pode ir ao Cinema: " + cinema);
		}else {
			System.out.println("Nao pode ir");
		}
		
		
		// ||
			Boolean carro = temDinheiro || idadeMaiorQueVinte;
			if(carro) {
				System.out.println("Pode efetuar a compra");
			}else {
				System.out.println("Nao pode efetuar a compra");
			}
		
		// !
			
			Boolean diferente = temDinheiro || idadeMaiorQueVinte;
			if(!diferente) {
				System.out.println("Verdade");
			}else {
				System.out.println("Falso");
			}
			

	}

}
