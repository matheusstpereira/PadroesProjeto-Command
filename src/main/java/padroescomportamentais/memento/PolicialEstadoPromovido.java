package padroescomportamentais.memento;

public class PolicialEstadoPromovido implements PolicialEstado{

    private PolicialEstadoPromovido() {};
    private static PolicialEstadoPromovido instance = new PolicialEstadoPromovido();
    public static PolicialEstadoPromovido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Promovido";
    }

}
