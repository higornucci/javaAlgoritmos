package br.com.htcursos.aula7;

public class Cliente {
	private String nome;
	private String cpf;
	private int idade;
	private String endereco;
	private Sexo sexo;
	private String telefone;
	
	public void imprimir() {
		System.out.println(nome);
		System.out.println(cpf);
		System.out.println(idade);
		System.out.println(endereco);
		System.out.println(sexo);
		System.out.println(telefone);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
