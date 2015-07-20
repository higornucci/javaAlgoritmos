package br.com.htcursos.aula3;

public class SelecionadorDeFrutas {
	public void mostrarOPreco(String nomeDaFruta) {
		switch (nomeDaFruta) {
		case "abacaxi":
			System.out.println("3 por 10");
			break;
		case "laranja":
			System.out.println("10zão o saco");
			break;
		case "PONKAN":
			System.out.println("10zão o balde");
			break;
		}
		
	}
}
