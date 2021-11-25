package padroesestruturais.proxy;

import java.util.List;

public class DetentoProxy implements IDetento{

    private Detento detento;
    private Integer id;

    public DetentoProxy(Integer id){
        this.id = id;
    }

    @Override
    public List<String> obterDadosPublicosDetento(){
        if (this.detento == null){
            this.detento = new Detento(this.id);
        }
        return this.detento.obterDadosPublicosDetento();
    }

    @Override
    public List<String> obterDadosPessoaisDetento(Policial policial) {
        if (!policial.isPermissao()) {
            throw new IllegalArgumentException("Policial não possui permissão");
        }
        if (this.detento == null) {
            this.detento = new Detento(this.id);
        }
        return this.detento.obterDadosPessoaisDetento(policial);
    }

}
