package LojaEletronico;

public class ProdutoFactory {
	public static Produto obterProduto(String nomeProduto) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("/DesignPatternsExercicio1/src/LojaEletronico/Produto" + nomeProduto);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Produto inexistente");
        }
        if (!(objeto instanceof Produto)) {
            throw new IllegalArgumentException("Produto inválido");
        }
        return (Produto) objeto;
    }
}
