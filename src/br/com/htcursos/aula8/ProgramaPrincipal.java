package br.com.htcursos.aula8;

import java.util.Date;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Cliente jao = new Cliente();
		jao.setNome("Jão da Silva");

		Date hoje = new Date();

		Pedido pedido1 = new Pedido();
		pedido1.setData(hoje);
		pedido1.setCliente(jao);

		ItemDoPedido livro = new ItemDoPedido();
		livro.setDescricao("Livro de Java");
		livro.setValor(100.0);

		ItemDoPedido cursoPresencialJava = new ItemDoPedido();
		cursoPresencialJava.setDescricao("Curso de Java");
		cursoPresencialJava.setValor(1200.00);

		ItemDoPedido cursoOnlineJava = new ItemDoPedido();
		cursoOnlineJava.setDescricao("Curso On Line de Java");
		cursoOnlineJava.setValor(850.00);

		ItemDoPedido pedidos[] = new ItemDoPedido[3];
		pedidos[0] = livro;
		pedidos[1] = cursoPresencialJava;
		pedidos[2] = cursoOnlineJava;

		pedido1.setItens(pedidos);

		pedido1.imprimirItens();

		Double valorTotal = pedido1.calcularValorTotal();
		System.out.println(valorTotal);
	}
}