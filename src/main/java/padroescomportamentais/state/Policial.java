package padroescomportamentais.state;

public class Policial {

    private String nome;
    private PolicialEstado estado;

    public Policial(){
        this.estado = PolicialEstadoIngressado.getInstance();
    }

    public void setEstado(PolicialEstado estado){
        this.estado = estado;
    }

    public String ingressar(){
        return estado.ingressar(this);
    }

    public String promover(){
        return estado.promover(this);
    }

    public String afastar(){
        return estado.afastar(this);
    }

    public String transferir(){
        return estado.transferir(this);
    }

    public String demitir(){
        return estado.demitir(this);
    }


    public String getNomeEstado(){
        return estado.getEstado();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public PolicialEstado getEstado() {
        return estado;
    }


}
