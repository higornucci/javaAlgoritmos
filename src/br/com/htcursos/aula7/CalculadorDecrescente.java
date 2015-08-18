package br.com.htcursos.aula7;

public class CalculadorDecrescente {
	public void calcular(int numero) {
		if(numero == 0) {
			return;
		}
		
		System.out.println(numero);
		
		calcular(numero - 1);
	}
}
