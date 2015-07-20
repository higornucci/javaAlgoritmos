package br.com.htcursos.dojo1;

public class CalculadorDeComisao {

	public double calcular(double valorDaVenda){
		if (valorDaVenda >= 10000)
			return valorDaVenda*0.05;
		else
			return valorDaVenda*0.04;
	}
}
