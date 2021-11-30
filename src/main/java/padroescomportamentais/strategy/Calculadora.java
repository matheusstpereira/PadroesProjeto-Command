package padroescomportamentais.strategy;

public class Calculadora {

    private float valor;

    public Calculadora(float valor) {
        this.valor = valor;
    }

    public float calcular(IDesconto iDesconto){
        return iDesconto.calcular(valor);
    }

}
