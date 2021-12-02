package padroescomportamentais.memento;

public class PolicialEstadoAfastado implements PolicialEstado{

    private PolicialEstadoAfastado() {};
    private static PolicialEstadoAfastado instance = new PolicialEstadoAfastado();
    public static PolicialEstadoAfastado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Afastado";
    }

}
