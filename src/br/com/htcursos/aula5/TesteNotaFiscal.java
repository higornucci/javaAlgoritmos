package br.com.htcursos.aula5;

public class TesteNotaFiscal {
	public static void main(String[] args) {
		NotaFiscal notaFiscal = new NotaFiscal();
		notaFiscal.adicionar("Pasta de dente", 5.0);
		notaFiscal.adicionar("Escova de dente", 10.0);
		notaFiscal.adicionar("Fio dental", 1.0);
		
		
		notaFiscal.imprimirNotasFiscais();
	}
}
