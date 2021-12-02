package padroescomportamentais.memento;

public class PolicialEstadoDemitido implements PolicialEstado{

    private PolicialEstadoDemitido() {};
    private static PolicialEstadoDemitido instance = new PolicialEstadoDemitido();
    public static PolicialEstadoDemitido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Demitido";
    }

}
