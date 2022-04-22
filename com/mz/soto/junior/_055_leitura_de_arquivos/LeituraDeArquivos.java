package com.mz.soto.junior._055_leitura_de_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraDeArquivos {

	public static void main(String[] args) throws IOException {
		
		Path arquivo = Paths.get("C:\\Users\\sotos\\OneDrive\\Desktop\\Programacao Com java Para Iniciantes\\Aulas\\escrita de arquivos\\turma.txt");
		
		
		List<String> linhas = Files.readAllLines(arquivo);
		
		for(int i = 0; i < linhas.size(); i++) {
			String nome = linhas.get(i);
			
			System.out.println("Aluno " + i + ": " + nome);
		}

	}

}
