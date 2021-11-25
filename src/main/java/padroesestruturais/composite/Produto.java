package padroesestruturais.composite;

public class Produto {

    private Conteudo informacoes;

    public void setInformacoes(Conteudo informacoes){
        this.informacoes = informacoes;
    }

    public String getInformacoes(){
        if (this.informacoes == null){
            throw new NullPointerException("Produto sem informacoes disponiveis");
        }
        return this.informacoes.getConteudo();
    }

}