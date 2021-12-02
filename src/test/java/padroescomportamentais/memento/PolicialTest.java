package padroescomportamentais.memento;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PolicialTest {

    @Test
    void deveArmazenarEstados() {
        Policial policial = new Policial();
        policial.setEstado(PolicialEstadoIngressado.getInstance());
        policial.setEstado(PolicialEstadoPromovido.getInstance());
        assertEquals(2, policial.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Policial policial = new Policial();
        policial.setEstado(PolicialEstadoIngressado.getInstance());
        policial.setEstado(PolicialEstadoPromovido.getInstance());
        policial.restauraEstado(0);
        assertEquals(PolicialEstadoIngressado.getInstance(), policial.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Policial policial = new Policial();
        policial.setEstado(PolicialEstadoIngressado.getInstance());
        policial.setEstado(PolicialEstadoPromovido.getInstance());
        policial.setEstado(PolicialEstadoAfastado.getInstance());
        policial.setEstado(PolicialEstadoDemitido.getInstance());
        policial.restauraEstado(2);
        assertEquals(PolicialEstadoAfastado.getInstance(), policial.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Policial policial = new Policial();
            policial.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Indice inválido", e.getMessage());
        }
    }


}
