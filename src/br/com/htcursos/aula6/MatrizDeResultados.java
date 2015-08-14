package br.com.htcursos.aula6;

import java.util.Random;

public class MatrizDeResultados {
	private static final int NUMERO_MESES = 12;

	public void calcular(int numeroDeAnos) {
		Integer resultados[][] = new Integer[numeroDeAnos][NUMERO_MESES];
		Random numeroRandomico = new Random();
		
		for(int linha = 0; linha < resultados.length; linha++) {
			for(int coluna = 0; coluna < resultados[linha].length; coluna++) {
				resultados[linha][coluna] = numeroRandomico.nextInt(100);
			}
		}
		
		int anoInicio = 2013;
		
		System.out.println(
		"\t| Jan \t| Fev \t| Mar\t| Abr\t| Mai\t| Jun\t| Jul\t| Ago\t| Set\t| Out\t| Nov\t| Dez\t|");
		for(int linha = 0; linha < resultados.length; linha++) {
			System.out.print(anoInicio +"\t| ");
			for(int coluna = 0; coluna < resultados[linha].length; coluna++) {
				System.out.print(resultados[linha][coluna] + " \t| ");
			}
			System.out.println("\n\t________________________________________________________________________________________________");
			anoInicio++;
		}
	}
}
