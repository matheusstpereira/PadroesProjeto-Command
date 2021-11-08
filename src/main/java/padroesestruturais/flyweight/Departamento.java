package padroesestruturais.flyweight;

public class Departamento {

    private String nome;
    private String cidade;

    public Departamento(String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome(){
        return nome;
    }

    public String getCidade(){
        return cidade;
    }

}
