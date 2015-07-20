package br.com.htcursos.aula3;

public class TesteLivro {
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.emprestarPara(Tipo.PROFESSOR);
	}
}
