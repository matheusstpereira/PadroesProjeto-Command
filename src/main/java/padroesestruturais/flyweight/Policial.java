package padroesestruturais.flyweight;

public class Policial {

    private String nome;
    private Departamento departamentoAtual;

    public Policial(String nome, Departamento departamentoAtual){
        this.nome = nome;
        this.departamentoAtual = departamentoAtual;
    }

    public String obterPolicial(){
        return "Policial{" +
                "nome='" + this.nome + '\'' +
                ", departamento='" + departamentoAtual.getNome() + '\'' +
                ", cidade='" + departamentoAtual.getCidade() + '\'' +
                '}';
    }

}
