package br.com.htcursos.aula4;

public class Escopo {
	public void demonstrar() {
		int valor = 0;
		for(int i = 0;i < 100;i++) {
			valor = 10;
			int contador = 0;
			if(contador > 0) {
				int numero = 100;
				valor = 5;
			}
			if (valor > 5) {
				contador =7;
				numero = 10;
			}
			numero = 10;
		}
		contador = 10;
	}
}
