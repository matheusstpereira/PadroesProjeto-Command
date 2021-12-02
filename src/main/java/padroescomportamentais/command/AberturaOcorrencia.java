package padroescomportamentais.command;

public class AberturaOcorrencia implements Ocorrencia{

    private OcorrenciaAtual ocorrenciaAtual;

    public AberturaOcorrencia(OcorrenciaAtual ocorrenciaAtual){
        this.ocorrenciaAtual = ocorrenciaAtual;
    }

    public void confirmaOcorrencia(){
        this.ocorrenciaAtual.abrirOcorrencia();
    }

    public void cancelarOcorrencia(){
        this.ocorrenciaAtual.fecharOcorrencia();
    }
}
