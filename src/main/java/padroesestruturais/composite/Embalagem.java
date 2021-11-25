package padroesestruturais.composite;

public class Embalagem extends Conteudo{

    private String logo;
    private String peso;

    public Embalagem(String descricao, String logo, String peso){
        super(descricao);
        this.logo = logo;
        this.peso = peso;
    }

    public String getLogo(){
        return logo;
    }

    public void setLogo(String logo){
        this.logo = logo;
    }

    public String getPeso(){
        return peso;
    }

    public void setPeso(String peso){
        this.peso= peso;
    }

    public String getConteudo(){
        return "Embalagem: " + this.getDescricao() + " - Logo: " + this.logo + " - Peso: " + this.peso + "\n";
    }


}