package padroescriacao.AbstractFactory;

public class FabricaPresencial implements FabricaAbstrata{

    @Override
    public Celula createCelula() {
        return new CelulaPresencial();
    }

    @Override
    public Sede createSede() {
        return new SedePresencial();
    }

}
