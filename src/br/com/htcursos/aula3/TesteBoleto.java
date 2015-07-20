package br.com.htcursos.aula3;

public class TesteBoleto {
	public static void main(String[] args) {
		Boleto boleto = new Boleto();
		boleto.valor = 100;
		boleto.situacao = Situacao.FATURADO;
		
		boleto.pagar(100);
		
		Boleto boletoDaEnergisa = new Boleto();
		boletoDaEnergisa.valor = 40;
		boletoDaEnergisa.situacao = Situacao.NAO_FATURADO;
		
		boletoDaEnergisa.pagar(40);
		boletoDaEnergisa.pagar(30);
	}
}
