package br.com.htcursos.aula5;

public class Cliente {
	String nome;
	int idade;
	String enderecos[] = new String[5];
	int ultimaPosicao = 0;
	
	public void adicionar(String endereco) {
		enderecos[ultimaPosicao] = endereco;
		ultimaPosicao++;
	}
	
	public void remover(int posicao) {
		enderecos[posicao] = null;
	}
	
	public void alterarEndereco(int posicao, String novoEndereco) {
		enderecos[posicao] = novoEndereco;
	}
	
	public void imprimirEnderecos() {
		for(int i = 0; i < enderecos.length; i++) {
			if(enderecos[i] != null) {
				System.out.println(enderecos[i]);
			}
		}
	}
}
