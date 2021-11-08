package padroesestruturais.bridge;

public class Arqueiro extends Classes{

    private int precisao;

    public Arqueiro(float danoBase){
        super(danoBase);
    }

    public void setPrecisao(int precisao){
        this.precisao = precisao;
    }

    public float calcularDano(){
        return this.danoBase * this.precisao * (1 + this.rank.multiplicadorDano());
    }

}
