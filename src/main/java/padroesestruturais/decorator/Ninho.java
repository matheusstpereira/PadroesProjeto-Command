package padroesestruturais.decorator;

public class Ninho extends AcaiDecorator{

    public Ninho(Acai acai){
        super(acai);
    }

    public float getPrecoComplemento(){
        return 1.0f;
    }

    public String getNomeComplemento(){
        return "Ninho";
    }

}
