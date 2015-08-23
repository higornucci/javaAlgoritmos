package br.com.htcursos.aula8;

import java.util.Date;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Cliente jao = new Cliente();
		jao.setNome("Jão da Silva");

		Date hoje = new Date();

		Pedido pedido = new Pedido();
		pedido.setData(hoje);
		pedido.setCliente(jao);

		ItemDoPedido livro = new ItemDoPedido();
		livro.setCodigo(2);
		livro.setDescricao("Livro de Java");
		livro.setValor(100.0);

		ItemDoPedido cursoPresencialJava = new ItemDoPedido();
		cursoPresencialJava.setCodigo(3);
		cursoPresencialJava.setDescricao("Curso de Java");
		cursoPresencialJava.setValor(1200.00);

		ItemDoPedido cursoOnlineJava = new ItemDoPedido();
		cursoOnlineJava.setCodigo(1);
		cursoOnlineJava.setDescricao("Curso On Line de Java");
		cursoOnlineJava.setValor(850.00);

		ItemDoPedido itensDoPedido[] = new ItemDoPedido[3];
		itensDoPedido[0] = livro;
		itensDoPedido[1] = cursoPresencialJava;
		itensDoPedido[2] = cursoOnlineJava;

		pedido.setItens(itensDoPedido);
		pedido.ordenarPedidosInsertionSort();
		pedido.adicionarItemPedido(livro);
		pedido.adicionarItemPedido(cursoPresencialJava);
		pedido.adicionarItemPedido(cursoOnlineJava);

		
		pedido.removerItemPedido(1);
		pedido.imprimirItens();

		Double valorTotal = pedido.calcularValorTotal();
		System.out.println(valorTotal);
	}
}