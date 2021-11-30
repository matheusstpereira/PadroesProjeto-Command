package padroescomportamentais.strategy;

public class DescontoAnoNovo implements IDesconto{

    public float calcular(float valor){
        return valor + ((valor / 100) * 20);
    }

}
