package padroescomportamentais.templatemethod;

public abstract class Policial {

    private int id;
    protected String nome;
    private String cidade;
    private Integer anosContribuicao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getAnosContribuicao() {
        return anosContribuicao;
    }

    public void setAnosContribuicao(int anosContribuicao) {
        this.anosContribuicao = anosContribuicao;
    }

    public String getTipo(){
        return "Policial";
    }

    public abstract String verificarAposentadoria();

    public String getRelatorio(){
        return getTipo() + "{" +
                "Id: " + this.id +
                ",Nome: " + this.nome +
                ",Cidade: " + this.cidade +
                ",Anos Contribuição: " + this.anosContribuicao +
                ",Resultado: " + this.verificarAposentadoria() + "}";
    }

}
