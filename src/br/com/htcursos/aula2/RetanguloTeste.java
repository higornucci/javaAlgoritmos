package br.com.htcursos.aula2;

public class RetanguloTeste {
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		retangulo.altura = 3;
		
		Integer areaTotal = retangulo.calcularArea();
		System.out.println(areaTotal);
	}
}
