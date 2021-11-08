package padroesestruturais.bridge;

public class Mago extends Classes{

    private int inteligencia;

    public Mago(float danoBase){
        super(danoBase);
    }

    public void setInteligencia(int inteligencia){
        this.inteligencia = inteligencia;
    }

    public float calcularDano(){
        return this.danoBase * this.inteligencia * (1 + this.rank.multiplicadorDano());
    }

}
