package br.com.htcursos.aula5;

import java.util.Scanner;

public class CadastroDeNotas {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Double notas[] = new Double[5];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota do aluno " + i);
			notas[i] = leitor.nextDouble();
		}
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		leitor.close();
	}
}
