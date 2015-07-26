package br.com.htcursos.aula4;


public class CalculadorDePoupanca {
	public double projetarPara(double valor, int meses) {
		double resultado = 0;
		for(int i = 1; i <= meses; i++) {
			resultado = resultado + (resultado * 0.005) + valor;
			if(resultado >= 3000) {
				System.out.println("Consegui!!!");
				System.out.println("Levará " + i + " meses.");
				break;
			}
		}
		return resultado ;
	}
}
