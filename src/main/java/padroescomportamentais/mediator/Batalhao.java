package padroescomportamentais.mediator;

public interface Batalhao{
    String receberSolicitacaoAuxilioFurto(String mensagem);
    String receberSolicitacaoAuxilioHomicidio(String mensagem);
    String receberSolicitacaoAuxilioAgressao(String mensagem);
}
