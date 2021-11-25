package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PolicialCivilTest {

    @Test
    void deveRetornarApto(){
        PolicialCivil policial = new PolicialCivil();
        policial.setId(1);
        policial.setNome("Matheus");
        policial.setCidade("Santos Dumont");
        policial.setAnosContribuicao(30);
        assertEquals("Apto para Aposentadoria", policial.verificarAposentadoria());
    }

    @Test
    void deveRetornarNaoApto(){
        PolicialCivil policial = new PolicialCivil();
        policial.setId(1);
        policial.setNome("Matheus");
        policial.setCidade("Santos Dumont");
        policial.setAnosContribuicao(29);
        assertEquals("Não Apto", policial.verificarAposentadoria());
    }

    @Test
    void deveRetornarRelatorio(){
        PolicialCivil policial = new PolicialCivil();
        policial.setId(1);
        policial.setNome("Matheus");
        policial.setCidade("Santos Dumont");
        policial.setAnosContribuicao(20);
        assertEquals("Policial Civil{Id: 1,Nome: Matheus,Cidade: Santos Dumont,Anos Contribuição: 20,Resultado: Não Apto}", policial.getRelatorio());
    }



}
