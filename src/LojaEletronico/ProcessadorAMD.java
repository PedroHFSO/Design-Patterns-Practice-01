package LojaEletronico;

public class ProcessadorAMD implements Processador{

	private ProcessadorAMD() {}
	private static ProcessadorAMD instance = new ProcessadorAMD();
	public static ProcessadorAMD getInstance() {
		return instance;
	}
	
	@Override
	public int getProcessamento() {
		return 70;
	}
	
}
