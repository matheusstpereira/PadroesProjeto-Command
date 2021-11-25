package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RelatorioTest {

    @Test
    void deveContarTotalPoliciais() {
        RH rh = new RH(
                new Policial("Guilherme", 45),
                new Policial("Julio", 30),
                new Policial("Miguel", 58)
        );
        assertEquals(3, Relatorio.contarTotalPoliciais(rh));
    }

    @Test
    void deveContarTotalPoliciaisAptosAposentadoria() {
        RH rh = new RH(
                new Policial("Guilherme", 45),
                new Policial("Julio", 30),
                new Policial("Miguel", 25),
                new Policial("Marlon", 60),
                new Policial("Luciano", 61),
                new Policial("Batista", 50),
                new Policial("Rafael", 45)
        );
        assertEquals(2, Relatorio.contarPoliciaisAptosAposentadoria(rh));
    }


}
