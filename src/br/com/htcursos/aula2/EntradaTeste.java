package br.com.htcursos.aula2;

import java.util.Scanner;

public class EntradaTeste {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
//		System.out.print("Qual seu nome? ");
//		String nome = leitor.next(); // l� String
//		System.out.println("Nome digitado: " + nome);
		
//		System.out.print("Digite o valor da esquerda: ");
//		Integer valorEsquerda = leitor.nextInt();
//		System.out.print("Digite o valor da direita: ");
//		Integer valorDireita = leitor.nextInt();
//		Calculadora calculadora = new Calculadora();
//		Integer resultado = calculadora.somar(valorEsquerda, valorDireita);
//		System.out.println("O resultado � " + resultado);
		
		System.out.print("Quanto voc� tem na carteira? ");
		double valorNaCarteira = leitor.nextDouble();
		System.out.println("Eu tenho R$ " + valorNaCarteira + " na carteira.");
//		leitor.nextFloat();
		
//		System.out.print("Voc� gosta de pizza?");
//		boolean resposta = leitor.nextBoolean();
//		System.out.println(resposta);
		
		leitor.close();
	}
}
