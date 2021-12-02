package padroescomportamentais.command;

public class FechamentoOcorrencia implements Ocorrencia{

    private OcorrenciaAtual ocorrenciaAtual;

    public FechamentoOcorrencia(OcorrenciaAtual ocorrenciaAtual){
        this.ocorrenciaAtual = ocorrenciaAtual;
    }

    public void confirmaOcorrencia(){
        this.ocorrenciaAtual.fecharOcorrencia();
    }

    public void cancelarOcorrencia(){
        this.ocorrenciaAtual.abrirOcorrencia();
    }

}
