package br.com.htcursos.dojo1;

public class TesteCarrinho {
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		double valorTotal = carrinho.calculoValorDesconto(150);
		System.out.println(valorTotal);

		valorTotal = carrinho.calculoValorDesconto(200);
		System.out.println(valorTotal);

		valorTotal = carrinho.calculoValorDesconto(300);
		System.out.println(valorTotal);

		valorTotal = carrinho.calculoValorDesconto(90);
		System.out.println(valorTotal);
	}
}
