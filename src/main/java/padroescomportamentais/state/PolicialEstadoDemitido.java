package padroescomportamentais.state;

public class PolicialEstadoDemitido implements PolicialEstado{

    private PolicialEstadoDemitido(){};
    private static PolicialEstadoDemitido instance = new PolicialEstadoDemitido();
    public static PolicialEstadoDemitido getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Demitido";
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
