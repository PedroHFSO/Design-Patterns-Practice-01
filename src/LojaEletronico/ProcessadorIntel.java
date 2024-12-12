package LojaEletronico;

public class ProcessadorIntel implements Processador{

	private ProcessadorIntel() {}
	private static ProcessadorIntel instance = new ProcessadorIntel();
	public static ProcessadorIntel getInstance() {
		return instance;
	}
	
	@Override
	public int getProcessamento() {
		return 80;
	}
	
}
