package padroesestruturais.adapter;

public class EntradaAdapter extends EntradaPlaystation {

    private IEntrada entradaDirecional;

    public EntradaAdapter(IEntrada entradaDirecional){
        this.entradaDirecional = entradaDirecional;
    }

    public String recuperarEntrada(){
        if (this.getGraus() == 0.0f)
            entradaDirecional.setEntrada("Cima");
        else
            if (this.getGraus() == 90.0f)
                entradaDirecional.setEntrada("Direita");
            else
                if (this.getGraus() == 180.0f)
                    entradaDirecional.setEntrada("Baixo");
                else
                    if (this.getGraus() == 270.0f)
                        entradaDirecional.setEntrada("Esquerda");
                    return entradaDirecional.getEntrada();
    }

    public void salvarEntrada(){
        if (entradaDirecional.getEntrada().equals("Cima"))
            this.setGraus(0.0f);
        else
            if (entradaDirecional.getEntrada().equals("Direita"))
                this.setGraus(90.0f);
            else
                if (entradaDirecional.getEntrada().equals("Baixo"))
                    this.setGraus(180.0f);
                else
                    if (entradaDirecional.getEntrada().equals("Esquerda"))
                        this.setGraus(270.0f);
    }



}
