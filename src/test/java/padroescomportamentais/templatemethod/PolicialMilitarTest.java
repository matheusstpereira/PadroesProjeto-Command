package padroescomportamentais.templatemethod;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PolicialMilitarTest {


    @Test
    void deveRetornarApto(){
        PolicialMilitar policial = new PolicialMilitar();
        policial.setId(1);
        policial.setNome("Matheus");
        policial.setCidade("Santos Dumont");
        policial.setAnosContribuicao(35);
        assertEquals("Apto para Aposentadoria", policial.verificarAposentadoria());
    }

    @Test
    void deveRetornarNaoApto(){
        PolicialMilitar policial = new PolicialMilitar();
        policial.setId(1);
        policial.setNome("Matheus");
        policial.setCidade("Santos Dumont");
        policial.setAnosContribuicao(34);
        assertEquals("Não Apto", policial.verificarAposentadoria());
    }

    @Test
    void deveRetornarRelatorio(){
        PolicialMilitar policial = new PolicialMilitar();
        policial.setId(1);
        policial.setNome("Matheus");
        policial.setCidade("Santos Dumont");
        policial.setAnosContribuicao(20);
        assertEquals("Policial Militar{Id: 1,Nome: Matheus,Cidade: Santos Dumont,Anos Contribuição: 20,Resultado: Não Apto}", policial.getRelatorio());
    }




}
