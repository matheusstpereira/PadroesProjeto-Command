package padroescomportamentais.memento;

public class PolicialEstadoIngressado implements PolicialEstado{

    private PolicialEstadoIngressado() {};
    private static PolicialEstadoIngressado instance = new PolicialEstadoIngressado();
    public static PolicialEstadoIngressado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Ingressado";
    }

}
