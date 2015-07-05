package br.com.htcursos.aula1;

public class CadastroDeProduto {
	public static void main(String[] args) {
		Produto blusa = new Produto();
		blusa.descricao = "Blusa de frio";
		blusa.quantidade = 10;
		System.out.println(blusa.quantidade.MAX_VALUE);
		Double.parseDouble(null);
		blusa.valorUnitario = 39.90;
		blusa.marca = Marca.DUDALINA;
		blusa.estacaoDoProduto = EstacaoDoAno.INVERNO;
		
		Produto sapato = new Produto();
		sapato.descricao = "Sapato envernizado";
		sapato.quantidade = 12345;
		sapato.valorUnitario = 69.90;
		sapato.marca = Marca.MARISA;
		
		System.out.println(blusa.descricao);
		System.out.println(blusa.marca);
		System.out.println(blusa.estacaoDoProduto);
	}
}
