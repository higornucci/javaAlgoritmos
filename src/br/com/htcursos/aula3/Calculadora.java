package br.com.htcursos.aula3;

import java.util.Scanner;

public class Calculadora {
	
	Scanner leitor = new Scanner(System.in);

	public double somar(double valorEsquerda, double valorDireita) {
		return valorEsquerda + valorDireita;
	}

	public double multiplicar(double valorEsquerda, double valorDireita) {
		return valorEsquerda * valorDireita;
	}

	public double dividir(double valorEsquerda, double valorDireita) {
		if (valorDireita > 0) {
			return valorEsquerda / valorDireita;
		} else {
			System.out.println("Digite o valor correto: ");
			valorDireita = leitor.nextDouble();
			return dividir(valorEsquerda, valorDireita);
		}
	}

	public double subtrair(double valorEsquerda, double valorDireita) {
		return valorEsquerda - valorDireita;
	}

	public double mod(double valorEsquerda, double valorDireita) {
		return valorEsquerda % valorDireita;
	}
}
