package br.com.htcursos.aula7;

public class TestaProduto {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setDescricao("Cenoura");
		produto.setValorUnitario(1.56);
		
		System.out.println(produto.getDescricao());
		System.out.println(produto.getValorUnitario());
	}
}
