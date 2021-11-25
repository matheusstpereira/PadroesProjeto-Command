package padroescriacao.factorymethod.factory;

import padroescriacao.factorymethod.model.IServico;
import padroescriacao.factorymethod.model.ServicoDemissao;

public class ServicoDemissaoFactory implements IServicoFactory{

    public IServico obterServico(){
        return new ServicoDemissao();
    }

}
