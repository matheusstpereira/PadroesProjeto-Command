package padroesestruturais.decorator;

public class Acai350 implements Acai{

    public float preco;

    public Acai350(){
    }

    public Acai350(float preco){
        this.preco = preco;
    }

    public float getPreco(){
        return preco;
    }

    public String getDescricao(){
        return "Açai 350ml";
    }


}
