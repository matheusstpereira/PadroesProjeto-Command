package padroesestruturais.facade;
import java.util.ArrayList;

public class Escolaridade extends Requisitos{

    private static Escolaridade escolaridade = new Escolaridade();

    private Escolaridade(){};
    public static Escolaridade getInstancia(){
        return escolaridade;
    }

}
