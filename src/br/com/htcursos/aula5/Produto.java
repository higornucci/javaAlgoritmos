package br.com.htcursos.aula5;

public class Produto {
	String nome;
	double valor;
	String marca;
	int quantidade;
	
	@Override
	public String toString() {
		return nome + " " + quantidade + " " + valor;
	}
}
