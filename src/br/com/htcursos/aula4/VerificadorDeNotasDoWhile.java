package br.com.htcursos.aula4;

import java.util.Scanner;

public class VerificadorDeNotasDoWhile {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		boolean notaInvalida;
		double nota = 0.0;
		do {
			System.out.print("Digite a nota do aluno: ");
			nota = leitor.nextDouble();
			if(nota < 0 || nota > 10) {
				System.out.println("Nota inválida. Redigite, por favor.");
				notaInvalida = true;
			} else {
				notaInvalida = false;
			}
		} while(notaInvalida);
		
		System.out.println(nota);
		
		leitor.close();
	}
}
