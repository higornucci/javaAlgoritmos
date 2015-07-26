package br.com.htcursos.aula4;

public class PoupancaTeste {
	public static void main(String[] args) {
		CalculadorDePoupanca calculador = new CalculadorDePoupanca();
		double resultado = calculador.projetarPara(100, 32);
		System.out.println(resultado);
		
		for(int x = 0; x < 5; x++) {
			System.out.println(x);
		}
	}
}
