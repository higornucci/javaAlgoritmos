package br.com.htcursos.aula8;

public class ItemDoPedido {
	private Integer codigo;
	private String descricao;
	private Double valor;
	
	public ItemDoPedido() {
		this.codigo = 0;
		this.descricao = "Não existente";
		this.valor = 0d;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ItemPedido [codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + "]";
	}
}