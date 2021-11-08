package padroesestruturais.facade;
import java.util.ArrayList;
import java.util.List;


public abstract class Requisitos {

    private List<Policial> policiaisComPendencia = new ArrayList<Policial>();

    public void addPolicialPendente(Policial policial){
        this.policiaisComPendencia.add(policial);
    }

    public boolean verificarPolicialComPendencia(Policial policial){
        return policiaisComPendencia.contains(policial);
    }


}
