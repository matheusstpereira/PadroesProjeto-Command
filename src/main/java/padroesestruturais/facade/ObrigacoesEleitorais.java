package padroesestruturais.facade;
import java.util.ArrayList;

public class ObrigacoesEleitorais extends Requisitos{

    private static ObrigacoesEleitorais obrigacoesEleitorais = new ObrigacoesEleitorais();

    private ObrigacoesEleitorais(){};
    public static ObrigacoesEleitorais getInstancia(){
        return obrigacoesEleitorais;
    }

}
