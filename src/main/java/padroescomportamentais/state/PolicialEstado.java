package padroescomportamentais.state;

public interface PolicialEstado {

    String getEstado();

    String ingressar(Policial policial);

    String promover(Policial policial);

    String afastar(Policial policial);

    String transferir(Policial policial);

    String demitir(Policial policial);

}
