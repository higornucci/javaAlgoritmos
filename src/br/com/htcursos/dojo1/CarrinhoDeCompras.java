package br.com.htcursos.dojo1;
public class CarrinhoDeCompras {
	
	public double calculoValorDesconto(double valorCarrinho){
		
		if(valorCarrinho>= 100 && valorCarrinho<200){
			return valorCarrinho - (valorCarrinho*0.02);			
		}
		else if(valorCarrinho >= 200 && valorCarrinho<300){
			return valorCarrinho - (valorCarrinho*0.03);
		}
		else if(valorCarrinho >= 300){
			return valorCarrinho - (valorCarrinho*0.04);
		}
		else {
			return valorCarrinho;
		}
	}
}
