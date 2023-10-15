package br.com.controle;

public class Calculo {
	
	private double comissao;

	public double calcularComissao(double valorVenda) {
		
		if(valorVenda>1000) {
			
			comissao = valorVenda*0.05;
			
		}
		
		else if(valorVenda<=1000) {
			
			comissao = valorVenda*0.02;
			
		}
		
		return comissao;
		
	}
}
