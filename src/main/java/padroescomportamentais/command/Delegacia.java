package padroescomportamentais.command;
import java.util.ArrayList;
import java.util.List;

public class Delegacia {

    private List<Ocorrencia> ocorrencias = new ArrayList<Ocorrencia>();

    public void realizarOcorrencia(Ocorrencia ocorrencia){
        this.ocorrencias.add(ocorrencia);
        ocorrencia.confirmaOcorrencia();
    }

    public void confirmarOcorrencia(){
        if (ocorrencias.size() !=0){
            Ocorrencia ocorrencia = this.ocorrencias.get(this.ocorrencias.size() - 1);
            ocorrencia.cancelarOcorrencia();
            this.ocorrencias.remove(this.ocorrencias.size() - 1);
        }
    }
}
