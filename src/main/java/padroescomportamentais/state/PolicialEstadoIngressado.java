package padroescomportamentais.state;

public class PolicialEstadoIngressado implements PolicialEstado{

    private PolicialEstadoIngressado(){};
    private static PolicialEstadoIngressado instance = new PolicialEstadoIngressado();
    public static PolicialEstadoIngressado getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Ingressado";
    }

    public String ingressar(Policial polical){
        return "Ingresso não realizado";
    }

    public String promover(Policial policial){
        policial.setEstado(PolicialEstadoPromovido.getInstance());
        return "Promoção realizada";
    }

    public String afastar(Policial policial){
        policial.setEstado(PolicialEstadoAfastado.getInstance());
        return "Afastamento realizado";
    }

    public String demitir(Policial policial){
        policial.setEstado(PolicialEstadoDemitido.getInstance());
        return "Demissão realizada";
    }

    public String transferir(Policial policial) {
        policial.setEstado(PolicialEstadoTransferido.getInstance());
        return "Transferência realizada";
    }


}
