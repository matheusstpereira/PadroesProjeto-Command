package padroescomportamentais.state;

public class PolicialEstadoAfastado implements PolicialEstado{

    private PolicialEstadoAfastado() {};
    private static PolicialEstadoAfastado instance = new PolicialEstadoAfastado();
    public static PolicialEstadoAfastado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Afastado";
    }

    public String ingressar(Policial policial){
        policial.setEstado(PolicialEstadoIngressado.getInstance());
        return "Ingresso realizado";
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
