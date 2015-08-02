package br.com.htcursos.aula5;

public class TesteCarrinho {
	public static void main(String[] args) {
		Produto pastaDeDente = new Produto();
		pastaDeDente.marca = "OralB";
		pastaDeDente.nome = "Pasta de dente";
		pastaDeDente.quantidade = 2;
		pastaDeDente.valor = 5.0;
		
		Produto fioDental = new Produto();
		fioDental.marca = "OralB";
		fioDental.nome = "Fio dental";
		fioDental.quantidade = 1;
		fioDental.valor = 1;
		
		CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
		carrinhoDeCompra.adicionar(pastaDeDente);
		carrinhoDeCompra.adicionar(fioDental);
		
		carrinhoDeCompra.imprimir();
	}
}
