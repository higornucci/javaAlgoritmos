package br.com.htcursos.aula2;

public class GastoTrimestral {
	double gastosJaneiro;
	double gastosFevereiro;
	double gastosMarco;
	
	public double calcular() {
		return gastosJaneiro + gastosFevereiro + gastosMarco;
	}
	
	public double calcularMedia() {
		return calcular()/3;
	}
}
