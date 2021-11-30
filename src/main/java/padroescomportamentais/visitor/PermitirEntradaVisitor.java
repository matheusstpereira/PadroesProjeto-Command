package padroescomportamentais.visitor;

public class PermitirEntradaVisitor implements Visitor{

    @Override
    public String visitaPessoa(Pessoa pessoa){
        return "Pessoa: " +
                "Nome: " + pessoa.getNome() + "," +
                "Endereco: " + pessoa.getEndereco() + "," +
                "Funcao: " + pessoa.getFuncao() + ".";
    }

    @Override
    public String visitaPolicial(Policial policial){
        return "Policial: " +
                "Nome: " + policial.getNome() + "," +
                "Endereco: " + policial.getEndereco() + "," +
                "Funcao: " + policial.getFuncao() + ".";
    }

    @Override
    public String visitaCarcereiro(Carcereiro carcereiro){
        return "Carcereiro: " +
                "Nome: " + carcereiro.getNome() + "," +
                "Endereco: " + carcereiro.getEndereco() + "," +
                "Funcao: " + carcereiro.getFuncao() + ".";
    }

}
