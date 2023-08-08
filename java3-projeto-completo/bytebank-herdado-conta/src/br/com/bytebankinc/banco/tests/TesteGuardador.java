package br.com.bytebankinc.banco.tests;

import br.com.bytebankinc.banco.modelos.Conta;
import br.com.bytebankinc.banco.modelos.ContaCorrente;
import br.com.bytebankinc.banco.modelos.GuardadorDeContas;

public class TesteGuardador {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador=new GuardadorDeContas();
		
		Conta cc=new ContaCorrente(22, 11);
		guardador.adicionar(cc);
		
		Conta cc2=new ContaCorrente(22, 22);
		guardador.adicionar(cc2);
		
		int tamanho=guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref= guardador.getReferencia(0);
		System.out.println(ref.getNumero());
		System.out.println();
	}
	
	

}
