package padroesestruturais.adapter;

public class EntradaDirecional implements IEntrada{

    private String direcional;

    @Override
    public String getEntrada(){
        return this.direcional;
    }

    @Override
    public void setEntrada(String direcional){
        this.direcional = direcional;
    }


}
