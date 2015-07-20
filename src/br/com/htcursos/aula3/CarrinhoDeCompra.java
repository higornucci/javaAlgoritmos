package br.com.htcursos.aula3;

public class CarrinhoDeCompra {
	double valor;
	
	public double retornarValor() {
		if(valor >= 100) {
			System.out.println(valor);
			double descontoAplicado = valor * 0.02;
			System.out.println(descontoAplicado);
			valor = valor - descontoAplicado;
		}
		System.out.println(valor);
		return valor;
	}
}
