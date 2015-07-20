package br.com.htcursos.aula3;

public class SelecionadorDeOperacoes {
	
	public double selecionarOperacao(double valorEsquerda, double valorDireita, int tipoDaOperacao) {
		Calculadora calculadora = new Calculadora();
		if(tipoDaOperacao == 1) {
			return calculadora.somar(valorEsquerda, valorDireita);
		} else if(tipoDaOperacao == 2) {
			return calculadora.multiplicar(valorEsquerda, valorDireita);
		} else if(tipoDaOperacao == 3) {
			return calculadora.subtrair(valorEsquerda, valorDireita); 
		} else {
			return calculadora.dividir(valorEsquerda, valorDireita);
		}
		
	}
}
