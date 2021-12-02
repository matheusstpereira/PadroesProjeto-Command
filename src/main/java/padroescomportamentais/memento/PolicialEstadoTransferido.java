package padroescomportamentais.memento;

public class PolicialEstadoTransferido implements PolicialEstado{

    private PolicialEstadoTransferido() {};
    private static PolicialEstadoTransferido instance = new PolicialEstadoTransferido();
    public static PolicialEstadoTransferido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Transferido";
    }

}
