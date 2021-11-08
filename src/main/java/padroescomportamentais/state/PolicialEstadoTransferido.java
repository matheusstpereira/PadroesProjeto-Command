package padroescomportamentais.state;

public class PolicialEstadoTransferido implements PolicialEstado{

    private PolicialEstadoTransferido(){};
    private static PolicialEstadoTransferido instance = new PolicialEstadoTransferido();
    public static PolicialEstadoTransferido getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Transferido";
    }

    public String ingressar(Policial polical){
        return "Ingresso não realizado";
    }

    public String promover(Policial policial){
        return "Promoção não realizada";
    }

    public String afastar(Policial policial){
        return "Afastamento não realizado";
    }

    public String demitir(Policial policial){
        return "Demissão não realizada";
    }

    public String transferir(Policial policial) {
        return "Transferência não realizada";
    }

}
