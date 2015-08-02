package br.com.htcursos.dojo2;

import java.util.Scanner;

public class ChicoBento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int limite= 10;
		int vetorPar[] = new int[limite];
		int vetorImpar[] = new int [limite];
		int contPar = 0;
		int contImpar = 0;
		
		System.out.println("Digite 10 n�meros:");
		for (int i = 0; i < limite; i++) {
			int numero = entrada.nextInt();
			
			if(numero % 2 == 0){
				vetorPar[contPar] = numero;
				contPar++;
			}
			else{
				vetorImpar[contImpar] = numero;
				contImpar++;
			}
		}
		
		System.out.println("N�meros Impares: ");
		for (int i = 0; i < vetorImpar.length; i++) {
			System.out.print(vetorImpar[i] + " ");
		}
		System.out.println();
		
		System.out.println("N�meros Pares: ");
		for (int i = 0; i < vetorPar.length; i++) {
			System.out.print(vetorPar[i] + " ");
		}
		
		entrada.close();
	}

}
