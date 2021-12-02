package padroescomportamentais.memento;
import java.util.ArrayList;
import java.util.List;

public class Policial {

    private PolicialEstado estado;
    private List<PolicialEstado> memento = new ArrayList<PolicialEstado>();

    public PolicialEstado getEstado(){
        return this.estado;
    }

    public void setEstado(PolicialEstado estado){
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice){
        if (indice < 0 || indice > this.memento.size() - 1){
            throw new IllegalArgumentException("Indice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<PolicialEstado> getEstados(){
        return this.memento;
    }


}
