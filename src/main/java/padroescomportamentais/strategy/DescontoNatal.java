package padroescomportamentais.strategy;

public class DescontoNatal implements IDesconto{

    public float calcular(float valor){
        return valor + ((valor / 100) * 40);
    }

}
