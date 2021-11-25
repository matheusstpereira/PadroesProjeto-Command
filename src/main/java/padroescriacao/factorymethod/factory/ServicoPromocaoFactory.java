package padroescriacao.factorymethod.factory;

import padroescriacao.factorymethod.model.IServico;
import padroescriacao.factorymethod.model.ServicoPromocao;

public class ServicoPromocaoFactory implements IServicoFactory{

    public IServico obterServico(){
        return new ServicoPromocao();
    }

}