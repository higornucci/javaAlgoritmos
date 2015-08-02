package br.com.htcursos.aula5;

public class NotaFiscal {
	String itens[] = new String[10];
	double valoresDosItens[] = new double[10];
	
	public void adicionar(String item, double valorDoItem) {
		for(int i = 0; i < itens.length; i++) {
			if(itens[i] == null) {
				itens[i] = item;
				valoresDosItens[i] = valorDoItem;
				break;
			}
		}
	}
	
	public void imprimirNotasFiscais() {
		for(int i = 0; i < itens.length; i++) {
			if(itens[i] != null) {
				System.out.println(itens[i] + 
						" R$ " + valoresDosItens[i]);
			}
		}
	}
}
