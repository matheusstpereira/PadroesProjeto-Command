package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.factory.ServicoDemissaoFactory;
import padroescriacao.factorymethod.model.IServico;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoDemissaoTest {

    @Test
    void deveExecutarDemissao(){
        IServico servico = new ServicoDemissaoFactory().obterServico();
        assertEquals("Demissao efetivada", servico.executar());
    }

    @Test
    void deveCancelarAdmissao(){
        IServico servico = new ServicoDemissaoFactory().obterServico();
        assertEquals("Demissao cancelada", servico.cancelar());
    }


}
