package br.com.htcursos.aula6;

import java.util.Scanner;

public class TestandoLeitor {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.nextLine();
		char letra = nome.charAt(0);
		System.out.println(nome);
		System.out.println(letra);
		leitor.close();
	}
}
