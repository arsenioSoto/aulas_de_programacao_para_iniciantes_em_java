package com.mz.soto.junior._056_ler_numeros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LerNumeros {

	public static void main(String[] args) throws IOException {
		
		List<String> linhas = lerNumerosDoArquivo("C:\\Users\\sotos\\OneDrive\\Desktop\\Programacao Com java Para Iniciantes\\Aulas\\escrita de arquivos\\nomes.txt");
		
		System.out.println("Lista de Numeros");
		
		for(int i = 0; i < linhas.size(); i++) {
			String numeros = linhas.get(i);
			
			System.out.println(i + ": " + numeros);
		}
		
		System.out.println("Terminar!");

	}
	
	static List<String> lerNumerosDoArquivo(String arquivo) throws IOException{
		Path path = Paths.get(arquivo);
		return Files.readAllLines(path); 
	}

}
