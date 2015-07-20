package br.com.htcursos.aula3;

public class Livro {
	Status status;
	String nome;
	Autor autor;
	int isbn;

	public void emprestarPara(Tipo tipo) {
		verificarSeLivroEstaEmprestado();
		if (status == Status.NO_ACERVO) {
			if (tipo == Tipo.ALUNO) {
				status = Status.EMPRESTADO_ALUNO;
			} else {
				status = Status.EMPRESTADO_PROFESSOR;
			}
		}
	}

	private void verificarSeLivroEstaEmprestado() {
		if (status == Status.EMPRESTADO_ALUNO || status == Status.EMPRESTADO_PROFESSOR) {
			System.out.println("O livro já está emprestado");
		}
	}
}
