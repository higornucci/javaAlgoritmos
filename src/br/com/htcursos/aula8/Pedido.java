package br.com.htcursos.aula8;

import java.util.Date;

public class Pedido {
	private Date data;
	private Cliente cliente;
	private ItemDoPedido itens[];
	private Integer numeroEntradas = 0;

	public void ordenarPedidosInsertionSort() {
		ItemDoPedido eleito;
		for (int i = 0; i < itens.length; i++) {
			eleito = itens[i];
			int j;
			for (j = i - 1; (j >= 0) && (itens[j].getCodigo() > eleito.getCodigo()); j--) {
				itens[j + 1] = itens[j];
			}
			itens[j + 1] = eleito;
		}
	}

	public ItemDoPedido[] ordenarItensPedidosBubbleSort() {
		ItemDoPedido aux;
		for(int i = 0; i < itens.length; i++) {
			for(int j = 0; j < itens.length - 1; j++) {
				if(itens[j].getCodigo() > itens[j + 1].getCodigo()) {
					aux = itens[j];
					itens[j] = itens[j + 1];
					itens[j + 1] = aux;
				}
			}
		}
		return itens;
	}

	public void adicionarItemPedido(ItemDoPedido itemPedido) {
		Integer codigoNovoItem = itemPedido.getCodigo();

		if (numeroEntradas == itens.length) {
			if (codigoNovoItem > itens[numeroEntradas - 1].getCodigo()) {
				return;
			}
		} else {
			numeroEntradas++;
		}

		int i = numeroEntradas - 1;
		for (; i >= 1 && codigoNovoItem < itens[i - 1].getCodigo(); i--) {
			itens[i] = itens[i - 1];
		}
		itens[i] = itemPedido;
	}

	public ItemDoPedido removerItemPedido(Integer i) {
		if (i < 0 || i >= numeroEntradas) {
			System.out.println("Erro! Índice inválido");
		}

		ItemDoPedido temp = itens[i];

		for (int j = i; j < numeroEntradas - 1; j++) {
			itens[j] = itens[j + 1];
		}

		itens[numeroEntradas - 1] = new ItemDoPedido();
		numeroEntradas--;
		return temp;
	}

	public ItemDoPedido buscaLinearItemPedido(Integer codigo) {
		for (int i = 0; i < numeroEntradas; i++) {
			if (itens[i].getCodigo().equals(codigo)) {
				return itens[i];
			}
		}
		return new ItemDoPedido();
	}

	public ItemDoPedido buscaBinariaItemPedido(Integer codigo ) {
		ordenarPedidosInsertionSort();
		boolean achou = false;
		int alto = itens.length - 1;
		int baixo = 0;
		int meio = alto / 2;

		while (!achou && alto >= baixo) {
			if (codigo == itens[meio].getCodigo()) {
				achou = true;
			} else if (codigo < itens[meio].getCodigo()) {
				alto = meio -1;
			} else {
				baixo = meio + 1;
			}
			meio = (alto + baixo) / 2;
		}
		return ( (achou) ? itens[meio] : new ItemDoPedido());
	}

	public Double calcularValorTotal() {
		Double somaValorTotal = 0.0;
		for (int i = 0; i < itens.length; i++) {
			somaValorTotal = somaValorTotal + itens[i].getValor();
		}
		return somaValorTotal;
	}

	public void imprimirItens() {
		for (int i = 0; i < itens.length; i++) {
			if(itens[i].getCodigo() != 0) {  
				System.out.print(itens[i] + "\n");
			}
		}

	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ItemDoPedido[] getItens() {
		return itens;
	}

	public void setItens(ItemDoPedido[] itens) {
		this.itens = itens;
	}
}