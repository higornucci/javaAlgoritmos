package br.com.htcursos.aula3;

public class TesteCarrinho {
	public static void main(String[] args) {
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.valor =90;
		carrinho.retornarValor();
		
		carrinho.valor =100;
		carrinho.retornarValor();
		
		carrinho.valor =130;
		carrinho.retornarValor();
	}
}
