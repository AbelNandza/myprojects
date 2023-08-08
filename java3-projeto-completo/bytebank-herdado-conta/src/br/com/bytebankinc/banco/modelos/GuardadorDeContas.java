package br.com.bytebankinc.banco.modelos;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int posicaolivre;

	public GuardadorDeContas() {
		
		this.referencias = new Conta[10];
		this.posicaolivre=0;
	}
	
	public void adicionar(Conta ref) {
		this.referencias[posicaolivre]=ref;
		this.posicaolivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaolivre;
	}

	public Conta getReferencia(int pos) {
		// TODO Auto-generated method stub
		return this.referencias[pos];
	}
	
	
	
	

}
