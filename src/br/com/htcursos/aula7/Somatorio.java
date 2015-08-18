package br.com.htcursos.aula7;

public class Somatorio {
	public int somar(int numero) {
		if(numero == 0) {
			return 0;
		}
		
		return numero + somar(numero - 1); 
	}
	
	public static void main(String[] args) {
		Somatorio somatorio = new Somatorio();
		int soma = somatorio.somar(4);
		System.out.println(soma);
	}
}