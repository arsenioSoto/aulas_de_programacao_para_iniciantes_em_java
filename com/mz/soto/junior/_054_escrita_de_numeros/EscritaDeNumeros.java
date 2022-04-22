package com.mz.soto.junior._054_escrita_de_numeros;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaDeNumeros {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		String  numeros;
		
		int i = 0;
		
		while(true) {
			
			System.out.print("Numero " + i + ": " );
			numeros = teclado.nextLine();
			
			if("X".equals(numeros)) {
				break;
			}
			
			linhas.add(numeros);
			i++;
		}
		
		escrever("C:\\Users\\sotos\\OneDrive\\Desktop\\Programacao Com java Para Iniciantes\\Aulas\\escrita de arquivos\\numeros.txt", linhas);
		
		System.out.println("Terminei");

	}
	
	static void escrever(String arquivo, ArrayList<String> linhas) throws IOException {
		Path path = Paths.get(arquivo);
		Files.write(path, linhas);
		
	}

}
