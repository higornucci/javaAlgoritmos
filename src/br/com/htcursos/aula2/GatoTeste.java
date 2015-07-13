package br.com.htcursos.aula2;

public class GatoTeste {
	public static void main(String[] args) {
		Gato gato = new Gato();
		gato.nome = "frajola";
		
		gato.miar();
		
		gato.nome = "Tom";
		gato.miar();
	}
}
