package padroescomportamentais.state;

public class PolicialEstadoPromovido implements PolicialEstado{

    private PolicialEstadoPromovido(){};
    private static PolicialEstadoPromovido instance = new PolicialEstadoPromovido();
    public static PolicialEstadoPromovido getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Promovido";
    }

    public String ingressar(Policial policial){
        policial.setEstado(PolicialEstadoPromovido.getInstance());
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
