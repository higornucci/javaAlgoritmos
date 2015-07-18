package br.com.htcursos.aula3;

public class SelecionadorDeOperacoes {
	
	public double selecionarOperacao(double valorEsquerda, double valorDireita, int tipoDaOperacao) {
		double resultado = 0;
		Calculadora calculadora = new Calculadora();
		
		if(tipoDaOperacao == 1) {
			resultado = calculadora.somar(valorEsquerda, valorDireita);
		} else if(tipoDaOperacao == 2) {
			resultado = calculadora.multiplicar(valorEsquerda, valorDireita);
		}
		
		return resultado;
	}
}
