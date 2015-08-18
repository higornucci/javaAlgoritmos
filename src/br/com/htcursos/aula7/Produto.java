package br.com.htcursos.aula7;

public class Produto {
	private String descricao;
	private double valorUnitario;

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double novoValorUnitario) {
		if(novoValorUnitario > 0) {
			this.valorUnitario = novoValorUnitario;
		} else {
			System.out.println("Valor menor que zero.");
		}
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String novaDescricao) {
		if(novaDescricao.length() > 3) {
			descricao = novaDescricao;
		} else {
			System.out.println("A descrição deve conter mais de três letras.");
		}
	}
}
