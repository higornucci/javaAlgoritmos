package br.com.htcursos.aula3;

public class SelecionadorDeOperacoes2 {
	public double selecionarOperacao(double valorEsquerda, double valorDireita, int tipoDaOperacao) {
		Calculadora calculadora = new Calculadora();
		
		switch (tipoDaOperacao) {
		case 1:
			return calculadora.somar(valorEsquerda, valorDireita);
		case 2:
			return calculadora.multiplicar(valorEsquerda, valorDireita);
		case 3:
			return calculadora.subtrair(valorEsquerda, valorDireita);
		case 4:
			return calculadora.dividir(valorEsquerda, valorDireita);
		default:
			System.out.println("Nenhuma operação escolhida");
			return 0;
		}
	}
}
