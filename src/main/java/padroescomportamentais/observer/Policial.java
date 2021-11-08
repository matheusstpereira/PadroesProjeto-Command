package padroescomportamentais.observer;

import java.util.Observable;
import java.util.Observer;

public class Policial implements Observer{

    private String nome;
    private String cpf;
    private String ultimaOcorrencia;

    public Policial(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getUltimaOcorrencia(){
        return this.ultimaOcorrencia;
    }

    public void escalar(Ocorrencia ocorrencia){
        ocorrencia.addObserver(this);
    }

    public void update(Observable ocorrencia, Object arg1){
        this.ultimaOcorrencia = this.nome + ", você foi escalado para a " + ocorrencia.toString();
    }

}
