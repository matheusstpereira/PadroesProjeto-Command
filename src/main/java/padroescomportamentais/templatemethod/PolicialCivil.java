package padroescomportamentais.templatemethod;

public class PolicialCivil extends Policial{

    public String verificarAposentadoria(){
        if (this.getAnosContribuicao() >= 30){
            return "Apto para Aposentadoria";
        }
        else {
            return "Não Apto";
        }
    }

    @Override
    public String getTipo(){
        return "Policial Civil";
    }

}
