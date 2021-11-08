package padroesestruturais.facade;
import java.text.Normalizer;

public class Policial {

    public boolean apto(){
        return PolicialFacade.verificarPendencias(this);
    }

}
