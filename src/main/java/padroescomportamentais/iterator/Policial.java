package padroescomportamentais.iterator;

public class Policial {

    private String nome;
    private Integer idade;

    public Policial(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Integer getIdade(){
        return idade;
    }

    public void setIdade(){
        this.idade = idade;
    }


    public boolean isAptoAposentadoria(){
        if(this.getIdade() > 55)
            return true;
        else
            return false;
    }

}
