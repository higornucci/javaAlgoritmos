package br.com.htcursos.aula4;

import java.util.Scanner;

public class VerificadorDeNotas {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		boolean notaInvalida = true;
		double nota = 0.0;
		while(notaInvalida) {
			System.out.print("Digite a nota do aluno: ");
			nota = leitor.nextDouble();
			if(nota < 0 || nota > 10) {
				System.out.println("Nota inválida. Redigite, por favor.");
				notaInvalida = true;
			} else {
				notaInvalida = false;
			}
		}
		System.out.println(nota);
		
		leitor.close();
	}
}
