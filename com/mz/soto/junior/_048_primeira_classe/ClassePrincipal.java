package com.mz.soto.junior._048_primeira_classe;

public class ClassePrincipal {

	public static void main(String[] args) {
		Produto telefone = new Produto();
		
		telefone.nome = "Nokia";
		telefone.precoUnitario = 2000.0;
		telefone.quantidade= 20;
		
		
		Produto televisao = new Produto();
		televisao.nome = "LG";
		televisao.precoUnitario = 4000.0;
		televisao.quantidade = 20;
		
		exibirEstoque(televisao);
		exibirEstoque(telefone);
		
		
	}
	
	static void exibirEstoque(Produto estoque) {
		System.out.println("Estoque do produto "+ estoque.nome + " eh de quantidade :" + estoque.quantidade);
	}

}
