package padroesestruturais.facade;
import java.util.ArrayList;

public class ObrigacoesMilitares extends Requisitos{

    private static ObrigacoesMilitares obrigacoesMilitares = new ObrigacoesMilitares();

    private ObrigacoesMilitares(){};
    public static ObrigacoesMilitares getInstancia(){
        return obrigacoesMilitares;
    }

}
