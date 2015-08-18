package br.com.htcursos.aula7;

public class Fatorial {
	public long calcular(int numero) {
		if(numero == 0) {
			return 1;
		}
		return numero * calcular(numero - 1);
	}
}
