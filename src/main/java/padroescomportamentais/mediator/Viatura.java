package padroescomportamentais.mediator;

public class Viatura implements Batalhao{

    private static Viatura instance = new Viatura();

    private Viatura(){
    }

    public static Viatura getInstance(){
        return instance;
    }

    public String receberSolicitacaoAuxilioFurto(String mensagem) {
        return "Viatura se deslocando ao local para auxilio a situação de Furto: " + mensagem;
    }

    public String receberSolicitacaoAuxilioHomicidio(String mensagem) {
        return "Viatura se deslocando ao local para auxilio a situação de Homicidio: " + mensagem;
    }

    public String receberSolicitacaoAuxilioAgressao(String mensagem) {
        return "Viatura se deslocando ao local para auxilio a situação de Agressao: " + mensagem;
    }

}
