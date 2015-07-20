package br.com.htcursos.dojo1;

public class Teste {

	public static void main(String[] args) {
		CalculadorDeComisao calculadorDeComisao = new CalculadorDeComisao();
		
		double resultado =calculadorDeComisao.calcular(100);
		System.out.println(resultado);
		
		resultado =calculadorDeComisao.calcular(11000);
		System.out.println(resultado);
		
		resultado =calculadorDeComisao.calcular(10000);
		System.out.println(resultado);

	}

}
