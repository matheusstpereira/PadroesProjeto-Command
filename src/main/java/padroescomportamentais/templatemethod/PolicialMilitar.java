package padroescomportamentais.templatemethod;

public class PolicialMilitar extends Policial{

    public String verificarAposentadoria(){
        if (this.getAnosContribuicao() >= 35){
            return "Apto para Aposentadoria";
        }
        else {
            return "Não Apto";
        }
    }

    @Override
    public String getTipo(){
        return "Policial Militar";
    }

}
