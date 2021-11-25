package padroesestruturais.decorator;

public class Morango extends AcaiDecorator{

    public Morango(Acai acai){
        super(acai);
    }

    public float getPrecoComplemento(){
        return 2.0f;
    }

    public String getNomeComplemento(){
        return "Morango";
    }

}
