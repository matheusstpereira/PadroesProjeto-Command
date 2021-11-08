package padroesestruturais.facade;
import java.util.ArrayList;

public class Nacionalidade extends Requisitos {

    private static Nacionalidade nacionalidade = new Nacionalidade();

    private Nacionalidade(){};
    public static Nacionalidade getInstancia(){
        return nacionalidade;
    }

}
