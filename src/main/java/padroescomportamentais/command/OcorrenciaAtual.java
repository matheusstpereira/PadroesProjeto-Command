package padroescomportamentais.command;

public class OcorrenciaAtual {
    private String nomeSolicitante;
    private String localOcorrencia;
    private String motivoOcorrencia;
    private String situacao;

    public OcorrenciaAtual(String nomeSolicitante, String localOcorrencia, String motivoOcorrencia){
        this.nomeSolicitante = nomeSolicitante;
        this.localOcorrencia = localOcorrencia;
        this.motivoOcorrencia = motivoOcorrencia;
    }

    public String getSituacao(){
        return situacao;
    }

    public void abrirOcorrencia(){
        this.situacao = "Ocorrencia aberta";
    }

    public void fecharOcorrencia(){
        this.situacao = "Ocorrencia fechada";
    }
}
