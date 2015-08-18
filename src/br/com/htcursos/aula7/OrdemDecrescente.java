package br.com.htcursos.aula7;

public class OrdemDecrescente {
	public void imprimir(int numero) {
		if(numero == 0) {
			return;
		}
		
		System.out.println(numero);
		
		imprimir(numero - 1);
	}
}
