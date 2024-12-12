package LojaEletronico;

public class ProdutoTablet extends Produto{

	public ProdutoTablet(Processador p) {}
	
	public float calcularPerformance() {
		return 1.3f * this.processador.getProcessamento();
	}
	
}
