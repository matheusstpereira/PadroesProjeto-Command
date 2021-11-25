package padroescriacao.factorymethod.model;

public class ServicoDemissao implements IServico{

    public String executar() {
        return "Demissao efetivada";
    }

    public String cancelar() {
        return "Demissao cancelada";
    }


}
