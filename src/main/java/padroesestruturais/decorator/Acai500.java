package padroesestruturais.decorator;

public class Acai500 implements Acai{

    public float preco;

    public Acai500(float preco){
        this.preco = preco;
    }

    public float getPreco(){
        return 8.0f;
    }

    public String getDescricao(){
        return "Açai 500ml";
    }

}
