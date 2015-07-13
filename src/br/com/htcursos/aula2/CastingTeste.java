package br.com.htcursos.aula2;

public class CastingTeste {
	public static void main(String[] args) {
		Integer valorInteiro = 10;
		
		float valorFloat = 20;
		
		double valorDouble = valorInteiro;
		valorDouble = valorFloat;
		valorFloat = (float) valorDouble;
		
		valorDouble = 30.3;
		valorInteiro = (int) valorDouble;
		
		System.out.println(valorInteiro);
		
		System.out.println(valorDouble);
		
		String valorString = "10";
		valorString = valorInteiro.toString();
		
		//valorInteiro = (int) valorString;
		
		valorInteiro = Integer.parseInt(valorString);
		System.out.println(valorInteiro);
	}
}
