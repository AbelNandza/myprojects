
public class Conexao implements AutoCloseable{


	    public Conexao() {
	        System.out.println("Abrindo conexao");
	    }

	    public void leDados() {
	        System.out.println("Recebendo dados");
	           throw new IllegalStateException();
	    }

	    public void fecha() {
	        System.out.println("Fechando conexao");
	    }

		@Override
		public void close() throws Exception {
			// TODO Auto-generated method stub
			
		}
	

}
