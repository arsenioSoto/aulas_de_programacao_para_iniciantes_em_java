package com.mz.soto.junior._053_leitura_e_escrita_em_arquivos_de_texto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaEmArquivosDeTexto {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Aluno " + i + ": ");
			String nome = teclado.nextLine();
			
			linhas.add(nome);
		}
		
		Path arquivo = Paths.get("C:\\Users\\sotos\\OneDrive\\Desktop\\Programacao Com java Para Iniciantes\\Aulas\\escrita de arquivos\\turma.txt");
		Files.write(arquivo, linhas);
		
		
		System.out.println("Terminei");
		
		
	}

}
