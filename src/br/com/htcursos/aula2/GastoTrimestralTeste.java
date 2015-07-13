package br.com.htcursos.aula2;

public class GastoTrimestralTeste {
	public static void main(String[] args) {
		GastoTrimestral gastoTrimestral = new GastoTrimestral();
		gastoTrimestral.gastosJaneiro = 1700;
		gastoTrimestral.gastosFevereiro = 1800;
		gastoTrimestral.gastosMarco = 1500;
		
		double media = gastoTrimestral.calcularMedia();
		System.out.println(media);
	}
}
