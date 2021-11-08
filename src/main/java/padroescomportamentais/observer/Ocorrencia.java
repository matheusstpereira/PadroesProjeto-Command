package padroescomportamentais.observer;
import java.util.Observable;

public class Ocorrencia extends Observable{

    private Integer id;
    private String nomeSolicitante;
    private String bairro;
    private String rua;
    private String numero;
    private String motivo;

    public Ocorrencia(Integer id, String nomeSolicitante, String bairro, String rua, String numero, String motivo){
        this.id = id;
        this.nomeSolicitante = nomeSolicitante;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.motivo = motivo;
    }

    public void publicarOcorrencia(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString(){
        return "Ocorrencia{" +
                "id=" + id +
                ", nomeSolicitante=" + nomeSolicitante +
                ", bairro=" + bairro +
                ", rua=" + rua +
                ", numero=" + numero +
                ", motivo=" + motivo + '}';
    }

}
