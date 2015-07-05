package br.com.htcursos.aula1;

public class CadastroDeCliente {
	public static void main(String[] args) {
		Cliente maria = new Cliente();
		System.out.println("Nome do Cliente: " + maria.nome);
		maria.nome = "Maria da Silva";
		maria.cpf = "0110223";
		maria.idade = 27;
		maria.renda = 1200.45;
		maria.temCartaoDaLoja = true;
		maria.genero = Genero.FEMININO;
		
		System.out.println(maria);
		
		Cliente joao = new Cliente();
		joao.genero = Genero.MASCULINO;
		joao.nome = "João da Silva";
		joao.cpf = "31231231";
		joao.idade = 29;
		System.out.println(joao.idade);
		System.out.println(maria.idade);
		joao.renda = 956;
		joao.temCartaoDaLoja = false;
		
		System.out.println("Nome do Cliente: " + maria.nome);
		maria.nome = "Josefa";
		System.out.println("Nome do Cliente: " + maria.nome);
		System.out.println("Nome do Cliente: " + joao.nome);
		System.out.println(joao.temCartaoDaLoja);
	}
}
