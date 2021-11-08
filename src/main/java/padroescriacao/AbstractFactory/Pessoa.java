package padroescriacao.AbstractFactory;

public class Pessoa {

    private Celula celula;
    private Sede sede;

    public Pessoa (FabricaAbstrata fabrica) {
        this.celula = fabrica.createCelula();
        this.sede = fabrica.createSede();
    }

    public String emitirCelula() {
        return this.celula.emitir();
    }

    public String emitirSede() {
        return this.sede.emitir();
    }

}
