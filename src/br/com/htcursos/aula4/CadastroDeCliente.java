package br.com.htcursos.aula4;

import java.util.Scanner;

public class CadastroDeCliente {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 1;i <= 3;i++) {
			Cliente cliente = new Cliente();
			
			System.out.print("Digite a idade do cliente " + i + ": ");
			cliente.idade = leitor.nextInt();
			System.out.print("Digite o nome do cliente " + i + ": ");
			cliente.nome = leitor.next();
			
			System.out.println(cliente.nome);
			System.out.println(cliente.idade);
		}
		
		leitor.close();
	}
}
