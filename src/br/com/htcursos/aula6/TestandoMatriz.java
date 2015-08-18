package br.com.htcursos.aula6;

import java.util.Scanner;

import br.com.htcursos.aula7.MatrizDeResultados;

public class TestandoMatriz {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Double notas[][] = new Double[3][2];
		
		for(int linha = 0; linha < notas.length; linha++) {
			for(int coluna = 0; coluna < notas[linha].length; coluna++) {
				System.out.print("Digite a nota " + coluna + " para o aluno " + linha);
				notas[linha][coluna] = leitor.nextDouble();
			}
		}
		
		leitor.close();
		
		for(int linha = 0; linha < notas.length; linha++) {
			System.out.print("Notas do aluno " + linha + ": ");
			for(int coluna = 0; coluna < notas[linha].length; coluna++) {
				System.out.print(notas[linha][coluna] + " ");
			}
			System.out.println("\n------------");
		}
	}
}
