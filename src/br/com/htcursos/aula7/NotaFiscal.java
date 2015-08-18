package br.com.htcursos.aula7;

public class NotaFiscal {
	private String itens[] = new String[10];
	private double valoresDosItens[] = new double[10];
	
	public void adicionar(String item, double valorDoItem) {
		for(int i = 0; i < itens.length; i++) {
			if(posicaoSemItens(i)) {
				itens[i] = item;
				valoresDosItens[i] = valorDoItem;
				break;
			}
		}
	}

	private boolean posicaoSemItens(int i) {
		return itens[i] == null;
	}
	
	public void imprimirNotasFiscais() {
		for(int i = 0; i < itens.length; i++) {
			if(!posicaoSemItens(i)) {
				System.out.println(itens[i] + 
						" R$ " + valoresDosItens[i]);
			}
		}
	}
}
