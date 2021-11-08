package padroesestruturais.bridge;

public abstract class Classes {

    protected Rank rank;
    protected float danoBase;
    protected float forca;
    protected float magia;
    protected float precisao;

    public Classes(float danoBase) {
        this.danoBase = danoBase;
    }

    public void setRank(Rank rank){
        this.rank = rank;
    }
    public void setDanoBase(float danoBase){
        this.danoBase = danoBase;
    }


    public abstract float calcularDano();

}
