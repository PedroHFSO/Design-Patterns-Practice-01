package LojaEletronico;

public abstract class Produto {

	public Produto() {}
	protected Processador processador;
	
	public void setProcessador(Processador p) {
		this.processador = p;
	}
	
	public abstract float calcularPerformance();
	
}
