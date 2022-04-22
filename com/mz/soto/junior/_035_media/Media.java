package com.mz.soto.junior._035_media;

public class Media {

	public static void main(String[] args) {
		
		Double[] notas = new Double[]{10.0, 12.0, 14.0, 8.0, 7.0};
		Double nota = 0.0;
		Double media = 0.0;
		for(int i = 0; i < notas.length; i++) {
			
			nota += notas[i]; //nt = 0 + 10
			
			media = nota/notas[i];
			
		}
		
		System.out.println(media);
	}

}
