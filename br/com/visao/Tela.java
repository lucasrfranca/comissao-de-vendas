package br.com.visao;

import java.util.Scanner;

import br.com.controle.Calculo;

public class Tela {
	
	static Calculo calculo = new Calculo();
	
	public static void main(String[] args) {
		
		double maiorVenda = 0.00;
		double totalComissao = 0.00;
		
		for(int i=0; i<3; i++) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o valor da venda:");
			double valorVenda = sc.nextDouble();
			
			double comissao = calculo.calcularComissao(valorVenda);
			totalComissao += comissao;
			
			if(valorVenda>maiorVenda) {
				
				maiorVenda = valorVenda;
				
			}
			
			System.out.println("----------------------");
			
		}
		
		System.out.println("Maior venda: R$" + maiorVenda);
		System.out.println("Valor total de comissoes: R$" + totalComissao);
		
	}
}
