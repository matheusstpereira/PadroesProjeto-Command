package padroesestruturais.bridge;
import org.junit.jupiter.api.Test;
import javax.swing.plaf.basic.BasicGraphicsUtils;
import static org.junit.jupiter.api.Assertions.*;

class ArqueiroTest {

    @Test
    void deveRetornarDanoTotalComOficial() {
        Rank rank = new Oficial();
        Arqueiro arqueiro = new Arqueiro(10.0f);
        arqueiro.setRank(rank);
        arqueiro.setPrecisao(5);
        assertEquals(50.0f, arqueiro.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoTotalComCavaleiro() {
        Rank rank = new Cavaleiro();
        Arqueiro arqueiro = new Arqueiro(10.0f);
        arqueiro.setRank(rank);
        arqueiro.setPrecisao(5);
        assertEquals(60.0f, arqueiro.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoTotalComGladiador() {
        Rank rank = new Gladiador();
        Arqueiro arqueiro = new Arqueiro(10.0f);
        arqueiro.setRank(rank);
        arqueiro.setPrecisao(5);
        assertEquals(70.0f, arqueiro.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoTotalComJusticeiro() {
        Rank rank = new Justiceiro();
        Arqueiro arqueiro = new Arqueiro(10.0f);
        arqueiro.setRank(rank);
        arqueiro.setPrecisao(5);
        assertEquals(90.0f, arqueiro.calcularDano(), 0.01f);
    }

}
