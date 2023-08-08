package br.com.bytebankinc.banco.tests;
import br.com.bytebankinc.banco.modelos.CalculadorDeImposto;
import br.com.bytebankinc.banco.modelos.ContaCorrente;
import br.com.bytebankinc.banco.modelos.SeguroDeVida;



public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
