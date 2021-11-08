package padroesestruturais.bridge;
import org.junit.jupiter.api.Test;
import javax.swing.plaf.basic.BasicGraphicsUtils;
import static org.junit.jupiter.api.Assertions.*;

class GuerreiroTest {

    @Test
    void deveRetornarDanoTotalComOficial() {
        Rank rank = new Oficial();
        Guerreiro guerreiro = new Guerreiro(10.0f);
        guerreiro.setRank(rank);
        guerreiro.setForca(10);
        assertEquals(100.0f, guerreiro.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoTotalComCavaleiro() {
        Rank rank = new Cavaleiro();
        Guerreiro guerreiro = new Guerreiro(10.0f);
        guerreiro.setRank(rank);
        guerreiro.setForca(10);
        assertEquals(120.0f, guerreiro.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoTotalComGladiador() {
        Rank rank = new Gladiador();
        Guerreiro guerreiro = new Guerreiro(10.0f);
        guerreiro.setRank(rank);
        guerreiro.setForca(10);
        assertEquals(140.0f, guerreiro.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoTotalComJusticeiro() {
        Rank rank = new Justiceiro();
        Guerreiro guerreiro = new Guerreiro(10.0f);
        guerreiro.setRank(rank);
        guerreiro.setForca(10);
        assertEquals(180.0f, guerreiro.calcularDano(), 0.01f);
    }

}
