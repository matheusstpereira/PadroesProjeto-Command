package padroescriacao.factorymethod.model;

public class ServicoAdmissao implements IServico {

    public String executar() {
        return "Admissao efetivada";
    }

    public String cancelar() {
        return "Admissao cancelada";
    }

}
