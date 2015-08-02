package br.com.htcursos.aula5;

public class CadastroEndereco {
	public static void main(String[] args) {
		String endereco1 = "Rua cesar ramos dos santos, 280";
		
		Cliente cliente = new Cliente();
		cliente.nome = "Joao";
		cliente.idade = 23;
		cliente.adicionar(endereco1);
		
		String endereco2 = "Rua Spip Calarge, 271";
		cliente.adicionar(endereco2);
		cliente.alterarEndereco(1, "Rua Spipe Calarge");
		
		cliente.adicionar("Rua da Paz");
		
		cliente.remover(0);
		
		cliente.imprimirEnderecos();
		
		int idades[] = new int[3];
		idades[0] = 10;
		idades[1] = 12;
		
		System.out.println(idades[0]);
		System.out.println(idades[1]);
		System.out.println(idades[2]);
		idades[4] = 30;
	}
}
