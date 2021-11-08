package padroesestruturais.bridge;

public class Guerreiro extends Classes{

    private int forca;

    public Guerreiro(float danoBase){
        super(danoBase);
    }

    public void setForca(int forca){
        this.forca = forca;
    }

    public float calcularDano(){
        return this.danoBase * this.forca * (1 + this.rank.multiplicadorDano());
    }

}
