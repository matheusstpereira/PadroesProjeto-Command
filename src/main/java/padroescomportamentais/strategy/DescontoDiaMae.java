package padroescomportamentais.strategy;

public class DescontoDiaMae implements IDesconto{

    public float calcular(float valor){
        return valor + ((valor / 100) * 30);
    }

}
