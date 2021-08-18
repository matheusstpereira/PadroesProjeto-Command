package padroescriacao.singleton;

public class Igreja {

    private Igreja(){};
    private static Igreja instance = new Igreja();
    public static Igreja getInstance() {
        return instance;
    }

    private String nomeIgreja;
    private String pastorIgreja;
    private String enderecoIgreja;

    public String getNomeIgreja() {
        return nomeIgreja;
    }
    public void setNomeIgreja(String nomeIgreja) {
        this.nomeIgreja = nomeIgreja;
    }

    public String getPastorIgreja() {
        return pastorIgreja;
    }
    public void setPastorIgreja(String pastorIgreja) {
        this.pastorIgreja = pastorIgreja;
    }

    public String getEnderecoIgreja() { return enderecoIgreja; }
    public void setEnderecoIgreja(String enderecoIgreja) { this.enderecoIgreja = enderecoIgreja; }
}
