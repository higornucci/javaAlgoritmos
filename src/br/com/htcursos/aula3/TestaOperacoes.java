package br.com.htcursos.aula3;

import java.util.Scanner;

public class TestaOperacoes {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("1 - Soma ");
		System.out.println("2 - Multiplica��o ");
		System.out.println("3 - Subtra��o ");
		System.out.println("4 - Divis�o ");
		System.out.print("Escolha entre uma das opera��es: ");
		int tipoDeOperacao = leitor.nextInt();
		System.out.print("Digite o valor da esquerda: ");
		double valorEsquerda = leitor.nextDouble();
		System.out.print("Digite o valor da direita: ");
		double valorDireita = leitor.nextDouble();
		
		SelecionadorDeOperacoes selecionador = new SelecionadorDeOperacoes();
		double resultado = selecionador.selecionarOperacao(valorEsquerda, valorDireita, tipoDeOperacao);
		System.out.println(resultado);
		
		leitor.close();
	}
}
