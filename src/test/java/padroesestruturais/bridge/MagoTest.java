package padroesestruturais.bridge;
import org.junit.jupiter.api.Test;
import javax.swing.plaf.basic.BasicGraphicsUtils;
import static org.junit.jupiter.api.Assertions.*;

class MagoTest {

    @Test
    void deveRetornarDanoTotalComOficial() {
        Rank rank = new Oficial();
        Mago mago = new Mago(10.0f);
        mago.setRank(rank);
        mago.setInteligencia(20);
        assertEquals(200.0f, mago.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoTotalComCavaleiro() {
        Rank rank = new Cavaleiro();
        Mago mago = new Mago(10.0f);
        mago.setRank(rank);
        mago.setInteligencia(20);
        assertEquals(240.0f, mago.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoTotalComGladiador() {
        Rank rank = new Gladiador();
        Mago mago = new Mago(10.0f);
        mago.setRank(rank);
        mago.setInteligencia(20);
        assertEquals(280.0f, mago.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoTotalComJusticeiro() {
        Rank rank = new Justiceiro();
        Mago mago = new Mago(10.0f);
        mago.setRank(rank);
        mago.setInteligencia(20);
        assertEquals(360.0f, mago.calcularDano(), 0.01f);
    }

}
