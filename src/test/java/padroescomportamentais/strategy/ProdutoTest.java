package padroescomportamentais.strategy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveCalcularDescontoDiaMae(){
        Produto produto = new Produto();
        produto.precoDescontoDiaMae(100.0f);
        assertEquals(130.0f, produto.getPreco());
    }

    @Test
    void deveCalcularDescontoDiaPai(){
        Produto produto = new Produto();
        produto.precoDescontoDiaPai(100.0f);
        assertEquals(115.0f, produto.getPreco());
    }

    @Test
    void deveCalcularDescontoNatal(){
        Produto produto = new Produto();
        produto.precoDescontoNatal(100.0f);
        assertEquals(140.0f, produto.getPreco());
    }

    @Test
    void deveCalcularDescontoAnoNovo(){
        Produto produto = new Produto();
        produto.precoDescontoAnoNovo(100.0f);
        assertEquals(120.0f, produto.getPreco());
    }



}
