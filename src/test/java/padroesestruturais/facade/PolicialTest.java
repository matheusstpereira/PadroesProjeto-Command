package padroesestruturais.facade;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PolicialTest {

    @Test
    void deveRetornarPendenciaEscolaridade() {
        Policial policial = new Policial();
        Escolaridade.getInstancia().addPolicialPendente(policial);

        assertEquals(false, policial.apto());
    }


    @Test
    void deveRetornarPendenciaNacionalidade() {
        Policial policial = new Policial();
        Nacionalidade.getInstancia().addPolicialPendente(policial);

        assertEquals(false, policial.apto());
    }

    @Test
    void deveRetornarPendenciaObrigacoesEleitorais() {
        Policial policial = new Policial();
        ObrigacoesEleitorais.getInstancia().addPolicialPendente(policial);

        assertEquals(false, policial.apto());
    }

    @Test
    void deveRetornarPendenciaObrigacoesMilitares() {
        Policial policial = new Policial();
        ObrigacoesMilitares.getInstancia().addPolicialPendente(policial);

        assertEquals(false, policial.apto());
    }

    @Test
    void deveRetornarPolicialSemPendencia(){
        Policial policial = new Policial();

        assertEquals(true, policial.apto());
    }

}
