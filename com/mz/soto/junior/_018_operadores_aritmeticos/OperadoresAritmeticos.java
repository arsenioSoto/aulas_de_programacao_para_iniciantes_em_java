package com.mz.soto.junior._018_operadores_aritmeticos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		System.out.println("=================== Operadores Aritmeticos ====================");
		
		Integer adicaoOperador = 3 + 2;
		System.out.println("Adicao: " + adicaoOperador);
		
		
		Integer subtracaoOperador = 3 - 2;
		System.out.println("Subtracao: " + subtracaoOperador);
		
		
		Integer multiplicacaoOperador = 3 * 2;
		System.out.println("Multiplicacao: " + multiplicacaoOperador);
		
		Integer divisaoOperador = 4 / 2;
		System.out.println("Divisao: " + divisaoOperador);
		  
		Integer amoduloOperador = 7 % 4;
		System.out.println("Modulo: " + adicaoOperador);
										    //4  +//32
		Integer primeiraOrdemDePrecedencia = 4 + 4 * 8; 
		System.out.println("Primeira: " + primeiraOrdemDePrecedencia);
		
		Integer segundaOrdemDePrecedencia = (4 + 4) * 8;
		System.out.println("Segunda: " + segundaOrdemDePrecedencia);
		
		Integer terceiraOrdemDePrecedencia = 8 * (4 + 4);
		System.out.println("Terceira: " + terceiraOrdemDePrecedencia);
		
		
		Integer quartaOrdemDePrecedencia = 2 * (4 + 4) + 4;
		System.out.println("Quarta: " + quartaOrdemDePrecedencia);
		
		
		Integer quintaOrdemDePrecedencia = 2 * ((4 + 4) + 4);
		System.out.println("Quinta: " + quintaOrdemDePrecedencia);
		
		Integer sete = 7;
		Integer um = 1;
		
		Integer ordemDePrecedenciaComVariaveis = sete * (um + um);
		System.out.println("Ordem de Precedencia com variaveis: " + ordemDePrecedenciaComVariaveis);
		
	}

}
