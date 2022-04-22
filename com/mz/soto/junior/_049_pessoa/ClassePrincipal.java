package com.mz.soto.junior._049_pessoa;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		Pessoa arsenio = new Pessoa();
		
		arsenio.nome = "Arsenio Soto";
		arsenio.idade = 19;
		
		System.out.println("Idade de " + arsenio.nome + " eh de "+ arsenio.idade + " ele e considerado " + idadeMenorOuMaior(arsenio));

	}
	
	
	static String idadeMenorOuMaior(Pessoa pessoa) {
		if(pessoa.idade < pessoa.IDADE_MINIMA) {
			return "Menor de Idade";
		}else {
			return "Maior de Idade";
		}
	}

}
