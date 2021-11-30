package padroescomportamentais.mediator;

public class CentralAtendimento {

    private static CentralAtendimento instance = new CentralAtendimento();

    private CentralAtendimento(){
    }

    public static CentralAtendimento getInstance(){
        return instance;
    }

    public String receberSolicitacaoAuxilioFurtoBatalhao(String mensagem){
        return "A Central de Atendimento recebeu sua solicitação. " +
                Viatura.getInstance().receberSolicitacaoAuxilioFurto(mensagem);
    }

    public String receberSolicitacaoAuxilioHomicidioBatalhao(String mensagem){
        return "A Central de Atendimento recebeu sua solicitação. " +
                Viatura.getInstance().receberSolicitacaoAuxilioHomicidio(mensagem);
    }

    public String receberSolicitacaoAuxilioAgressaoBatalhao(String mensagem){
        return "A Central de Atendimento recebeu sua solicitação. " +
                Viatura.getInstance().receberSolicitacaoAuxilioAgressao(mensagem);
    }

}
