package br.com.htcursos.aula3;

public class Boleto {
	double valor;
	Situacao situacao;

	public void pagar(double valor) {
		if (situacao == Situacao.FATURADO) {
			System.out.println("Este boleto já esta pago");
		} else if (situacao == Situacao.NAO_FATURADO && valor != this.valor) {
				System.out.println("O valor pago é menor que o do boleto.");
		} else if (situacao == Situacao.NAO_FATURADO || situacao == Situacao.EM_ATRASO && valor == this.valor) {
				this.valor = this.valor - valor;
				situacao = Situacao.FATURADO;
				System.out.println("Obrigado por pagar.");
		}
	}
}
