package LojaEletronico;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProjectTesting {

	@Test
    void deveRetornarPerformanceNotebookIntel() {
        Produto notebook = ProdutoFactory.obterProduto("Notebook");
        Processador p = ProcessadorIntel.getInstance(); 
        notebook.setProcessador(p);
        assertEquals(160.0f, notebook.calcularPerformance(), 0.01f);
    }

    @Test
    void deveRetornarPerformanceTabletAMD() {
    	Produto tablet = ProdutoFactory.obterProduto("Tablet");
        Processador p = ProcessadorAMD.getInstance(); 
        tablet.setProcessador(p);
        assertEquals(91.0f, tablet.calcularPerformance(), 0.01f);
    }
    
}
