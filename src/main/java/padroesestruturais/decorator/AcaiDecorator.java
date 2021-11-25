package padroesestruturais.decorator;

public abstract class AcaiDecorator implements Acai {

    private Acai acai;
    public String descricao;

    public AcaiDecorator(Acai acai){
        this.acai = acai;
    }

    public Acai getAcai(){
        return acai;
    }

    public void setAcai(Acai acai){
        this.acai = acai;
    }

    public abstract float getPrecoComplemento();

    public float getPreco(){
        return this.acai.getPreco() + (this.getPrecoComplemento());
    }

    public abstract String getNomeComplemento();

    public String getDescricao(){
        return this.acai.getDescricao() + "+" + this.getNomeComplemento();
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

}
