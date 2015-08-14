package br.com.htcursos.aula6;

import java.util.Random;

public class MatrizRandomica {
	public static void main(String[] args) {
		Random numeroRandomico = new Random();
		Integer matriz[][] = new Integer[12][8];
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = numeroRandomico.nextInt(100);
			}
		}
		
		for(int linha = 0; linha < matriz.length; linha++) {
			System.out.print("Linha " + linha +" | ");
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.print(matriz[linha][coluna] + " \t| ");
			}
			System.out.println("\n_________________________________________________________________________");
		}
	}
}
