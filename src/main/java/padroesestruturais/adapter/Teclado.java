package padroesestruturais.adapter;

public class Teclado {

    IEntrada entrada;
    EntradaAdapter persistencia;

    public Teclado(){
        entrada = new EntradaDirecional();
        persistencia = new EntradaAdapter(entrada);
    }

    public void setEntrada(String direcional){
        entrada.setEntrada(direcional);
        persistencia.salvarEntrada();
    }

    public String getEntrada(){
        return persistencia.recuperarEntrada();
    }

    public float getGraus(){
        return persistencia.getGraus();
    }



}
