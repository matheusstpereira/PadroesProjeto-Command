package padroescriacao.factorymethod.factory;

import padroescriacao.factorymethod.model.IServico;
import padroescriacao.factorymethod.model.ServicoAdmissao;

public class ServicoAdmissaoFactory implements IServicoFactory {

    public IServico obterServico(){
        return new ServicoAdmissao();
    }

}
