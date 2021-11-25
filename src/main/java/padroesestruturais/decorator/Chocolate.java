package padroesestruturais.decorator;

public class Chocolate extends AcaiDecorator{

    public Chocolate(Acai acai){
        super(acai);
    }

    public float getPrecoComplemento(){
        return 2.0f;
    }

    public String getNomeComplemento(){
        return "Chocolate";
    }


}
