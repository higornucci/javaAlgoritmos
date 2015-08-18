package br.com.htcursos.aula7;

import java.util.Scanner;

public class CadastroCliente {
	
	public void cadastrar() {
		Scanner leitor = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		System.out.println("Digite o nome do cliente:");
		cliente.setNome(leitor.nextLine());
		System.out.println("Digite a idade do cliente:");
		cliente.setIdade(leitor.nextInt());
		
		if(cliente.getIdade() > 50) {
			cadastrar();
		}
		
		leitor.close();
	}
}
