package padroescriacao.factorymethod.model;

public class ServicoPromocao implements IServico{

    public String executar() {
        return "Promoção efetivada";
    }

    public String cancelar() {
        return "Promoção cancelada";
    }

}
