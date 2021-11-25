package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.factory.ServicoAdmissaoFactory;
import padroescriacao.factorymethod.model.IServico;
import padroescriacao.factorymethod.model.ServicoAdmissao;

import static org.junit.jupiter.api.Assertions.*;

class ServicoAdmissaoTest {

    @Test
    void deveExecutarAdmissao(){
        IServico servico = new ServicoAdmissaoFactory().obterServico();
        assertEquals("Admissao efetivada", servico.executar());
    }

    @Test
    void deveCancelarAdmissao(){
        IServico servico = new ServicoAdmissaoFactory().obterServico();
        assertEquals("Admissao cancelada", servico.cancelar());
    }

}
