package br.com.htcursos.aula5;

public class CarrinhoDeCompra {
	Produto produtos[] = new Produto[10];
	
	public void adicionar(Produto produto) {
		for(int i = 0; i < produtos.length;i++) {
			if(produtos[i] == null) {
				produtos[i] = produto;
				break;
			}
		}
	}
	
	public void imprimir() {
		for(Produto produto : produtos) {
			if(produto != null) {
				System.out.println(produto);
			}
		}
	}
}
