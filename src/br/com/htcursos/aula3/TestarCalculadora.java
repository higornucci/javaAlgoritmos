package br.com.htcursos.aula3;

public class TestarCalculadora {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.dividir(3, 0);
		
		System.out.println(resultado);
		
		resultado = calculadora.dividir(3, 3);
		
		System.out.println(resultado);
	}
}
