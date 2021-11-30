package padroescomportamentais.strategy;

public class DescontoDiaPai implements IDesconto{

    public float calcular(float valor){
        return valor + ((valor / 100) * 15);
    }

}
