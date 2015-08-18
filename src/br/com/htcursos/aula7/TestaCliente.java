package br.com.htcursos.aula7;

public class TestaCliente {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("João da Silva");
		cliente.setCpf("123456789-10");
		cliente.setEndereco("Rua da Paz, 34");
		cliente.setIdade(56);
		cliente.setSexo(Sexo.MASCULINO);
		cliente.setTelefone("67 3201 9069");
		
		cliente.imprimir();
	}
}
