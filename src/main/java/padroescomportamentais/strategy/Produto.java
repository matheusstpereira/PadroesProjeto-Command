package padroescomportamentais.strategy;

public class Produto {

    private float preco;

    public float getPreco(){
        return preco;
    }

    public void precoDescontoDiaMae(float preco){
        Calculadora calculadora = new Calculadora(preco);
        this.preco = calculadora.calcular(new DescontoDiaMae());
    }

    public void precoDescontoDiaPai(float preco){
        Calculadora calculadora = new Calculadora(preco);
        this.preco = calculadora.calcular(new DescontoDiaPai());
    }

    public void precoDescontoNatal(float preco){
        Calculadora calculadora = new Calculadora(preco);
        this.preco = calculadora.calcular(new DescontoNatal());
    }

    public void precoDescontoAnoNovo(float preco){
        Calculadora calculadora = new Calculadora(preco);
        this.preco = calculadora.calcular(new DescontoAnoNovo());
    }


}
