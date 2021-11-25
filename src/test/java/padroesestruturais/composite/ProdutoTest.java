package padroesestruturais.composite;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveRetornarInformacoesProduto(){
        ValorNutricional valorNutricional1 = new ValorNutricional("Valor Energetico: 76Kcal, Carboidratos: 10g");
        ValorNutricional valorNutricional2 = new ValorNutricional("Proteinas: 2.6g, Gorduras Totais: 2.6g");

        Embalagem embalagem1 = new Embalagem("Gorduras Saturadas: 1.1g, Gorduras Trans: 0.3g", "Cheetos", "250g");
        Embalagem embalagem2 = new Embalagem("Fibra Alimentar: 0g, Sodio: 258mg", "Doritos", "250g");

        valorNutricional1.addConteudo(embalagem1);
        valorNutricional2.addConteudo(embalagem2);

        ValorNutricional informacoes = new ValorNutricional("Biscoitos");
        informacoes.addConteudo(valorNutricional1);
        informacoes.addConteudo(valorNutricional2);

        Produto produto = new Produto();
        produto.setInformacoes(informacoes);

        assertEquals("Valor Nutricional: Biscoitos\n" +
                "Valor Nutricional: Valor Energetico: 76Kcal, Carboidratos: 10g\n" +
                "Embalagem: Gorduras Saturadas: 1.1g, Gorduras Trans: 0.3g - Logo: Cheetos - Peso: 250g\n" +
                "Valor Nutricional: Proteinas: 2.6g, Gorduras Totais: 2.6g\n" +
                "Embalagem: Fibra Alimentar: 0g, Sodio: 258mg - Logo: Doritos - Peso: 250g\n", produto.getInformacoes());

    }

    @Test
    void deveRetornarExecaoProdutoSemInformacoes(){
        try{
            Produto produto = new Produto();
            produto.getInformacoes();
            fail();
        }
        catch (NullPointerException a){
            assertEquals("Produto sem informacoes disponiveis", a.getMessage());
        }
    }
}