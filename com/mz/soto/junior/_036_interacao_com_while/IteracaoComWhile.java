package com.mz.soto.junior._036_interacao_com_while;

public class IteracaoComWhile {

	public static void main(String[] args) {
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
		
//		int i = 0;
//		while(i < 10) {
//			System.out.print(i);
//			i++;
//		}
		
		int i = 0;
		while(i < 10) {
			if(i == 5) {
				System.out.println("continuar");
				//break;
				i++;
				continue;
			}
			
			System.out.println(i);
			i++;
		}
				
	}

}
