package br.com.htcursos.aula6;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com o número de pessoas que serão entrevistadas:");
		int numeroDeEntrevistados = leitor.nextInt();
		
		String[][] nomesDeFilhos = new String[numeroDeEntrevistados][];
		
		for (int linha=0; linha<nomesDeFilhos.length; linha++){
			
			System.out.println("Entre com a quantidade de filhos");
			int quqantidadeDeFilhos = leitor.nextInt();
			
			nomesDeFilhos[linha] = new String[quqantidadeDeFilhos];
			
			for (int coluna=0; coluna<nomesDeFilhos[linha].length; coluna++){
				
				System.out.println("Digite o nome do filho " + (coluna+1));
				
				nomesDeFilhos[linha][coluna] = leitor.next();
			}
		}

		for (int linha=0; linha<nomesDeFilhos.length; linha++){
			System.out.println("Pessoa " + linha + " tem " + nomesDeFilhos[linha].length + " filhos");
			for (int coluna=0; coluna<nomesDeFilhos[linha].length; coluna++){
				System.out.println(nomesDeFilhos[linha][coluna]);
			}
		}
		
		leitor.close();
	}

}