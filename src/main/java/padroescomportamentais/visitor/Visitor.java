package padroescomportamentais.visitor;

public interface Visitor {

    String visitaPolicial(Policial policial);
    String visitaCarcereiro(Carcereiro carcereiro);
    String visitaPessoa(Pessoa pessoa);
}
