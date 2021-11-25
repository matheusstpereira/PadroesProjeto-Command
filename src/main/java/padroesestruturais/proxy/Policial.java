package padroesestruturais.proxy;

public class Policial {

    private String nome;
    private boolean permissao;

    public Policial(String nome, boolean permissao) {
        this.nome = nome;
        this.permissao = permissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPermissao() {
        return permissao;
    }

    public void setPermissao(boolean permissao) {
        this.permissao = permissao;
    }

}
