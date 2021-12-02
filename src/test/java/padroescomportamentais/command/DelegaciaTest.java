package padroescomportamentais.command;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DelegaciaTest {

    Delegacia delegacia;
    OcorrenciaAtual ocorrenciaAtual;


    @BeforeEach
    void setUp(){
        delegacia = new Delegacia();
        ocorrenciaAtual = new OcorrenciaAtual("Marcio", "Rua Maquinista, Santos Dumont", "Agressao");
    }

    @Test
    void deveAbrirOcorrencia() {
        Ocorrencia aberturaOcorrencia = new AberturaOcorrencia(ocorrenciaAtual);
        delegacia.realizarOcorrencia(aberturaOcorrencia);

        assertEquals("Ocorrencia aberta", ocorrenciaAtual.getSituacao());
    }

    @Test
    void deveFecharOcorrencia() {
        Ocorrencia fechamentoOcorrencia = new FechamentoOcorrencia(ocorrenciaAtual);
        delegacia.realizarOcorrencia(fechamentoOcorrencia);

        assertEquals("Ocorrencia fechada", ocorrenciaAtual.getSituacao());
    }

    @Test
    void deveCancelarFechamentoOcorrencia() {
        Ocorrencia aberturaOcorrencia = new AberturaOcorrencia(ocorrenciaAtual);
        Ocorrencia fechamentoOcorrencia = new FechamentoOcorrencia(ocorrenciaAtual);

        delegacia.realizarOcorrencia(aberturaOcorrencia);
        delegacia.realizarOcorrencia(fechamentoOcorrencia);

        delegacia.confirmarOcorrencia();

        assertEquals("Ocorrencia aberta", ocorrenciaAtual.getSituacao());
    }







}
