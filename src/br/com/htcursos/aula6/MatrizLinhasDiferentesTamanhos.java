package br.com.htcursos.aula6;

public class MatrizLinhasDiferentesTamanhos {
	public static void main(String[] args) {
		int matriz[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

		int linha, coluna;
		for (linha = 0; linha < matriz.length; linha++) {
			
			System.out.printf("%da. linha: ", (linha + 1));
			
			for (coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("%d ", matriz[linha][coluna]);
			}
			
			System.out.printf("\n");
		}
	}
}
