package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import padroescriacao.factorymethod.factory.ServicoPromocaoFactory;
import padroescriacao.factorymethod.model.IServico;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoPromocao {

    @Test
    void deveExecutarAdmissao(){
        IServico servico = new ServicoPromocaoFactory().obterServico();
        assertEquals("Promoção efetivada", servico.executar());
    }

    @Test
    void deveCancelarAdmissao(){
        IServico servico = new ServicoPromocaoFactory().obterServico();
        assertEquals("Promoção cancelada", servico.cancelar());
    }

}
