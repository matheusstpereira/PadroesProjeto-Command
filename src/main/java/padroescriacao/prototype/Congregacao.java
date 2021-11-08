package padroescriacao.prototype;

public class Congregacao implements Cloneable{
    private String nomeCongregacao;
    private String enderecoCongregacao;

    public Congregacao(String nomeCongregacao, String enderecoCongregacao){
        super();
        this.nomeCongregacao = nomeCongregacao;
        this.enderecoCongregacao = enderecoCongregacao;
    }

    public String getNomeCongregacao() {
        return nomeCongregacao;
    }

    public void setNomeCongregacao(String nomeCongregacao) {
        this.nomeCongregacao = nomeCongregacao;
    }

    public String getEnderecoCongregacao() {
        return enderecoCongregacao;
    }

    public void setEnderecoCongregacao(String enderecoCongregacao) {
        this.enderecoCongregacao = enderecoCongregacao;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Congregacao{" +
                "nomeCongregacao='" + nomeCongregacao + '\'' +
                ", enderecoCongregacao=" + enderecoCongregacao +
                '}';
    }


}
