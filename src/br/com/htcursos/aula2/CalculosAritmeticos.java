package br.com.htcursos.aula2;

public class CalculosAritmeticos {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.somar(40, 5);
		
		System.out.println(resultado);
		System.out.println(calculadora.somar(10, 10));
		
		double valorEsquerda = 10;
		double valor2 = 3;
		double produto = calculadora.multiplicar(valorEsquerda, valor2);
		System.out.println(produto);
	}
}
