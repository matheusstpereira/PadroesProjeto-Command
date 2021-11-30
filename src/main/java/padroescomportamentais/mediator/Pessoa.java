package padroescomportamentais.mediator;

public class Pessoa {

    public String solicitarAuxilioFurto(String mensagem) {
        return CentralAtendimento.getInstance().receberSolicitacaoAuxilioFurtoBatalhao(mensagem);
    }

    public String solicitarAuxilioHomocidio(String mensagem) {
        return CentralAtendimento.getInstance().receberSolicitacaoAuxilioHomicidioBatalhao(mensagem);
    }

    public String solicitarAuxilioAgressao(String mensagem) {
        return CentralAtendimento.getInstance().receberSolicitacaoAuxilioAgressaoBatalhao(mensagem);
    }

}
