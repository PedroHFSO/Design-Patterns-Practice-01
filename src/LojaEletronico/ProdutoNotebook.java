package LojaEletronico;

public class ProdutoNotebook extends Produto{

	public ProdutoNotebook() {}
	
	public float calcularPerformance() {
		return 2.0f * this.processador.getProcessamento();
	}
	
}
