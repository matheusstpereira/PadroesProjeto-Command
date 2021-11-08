package padroescriacao.AbstractFactory;

public class FabricaLar implements FabricaAbstrata{

    @Override
    public Celula createCelula() {
        return new CelulaLar();
    }

    @Override
    public Sede createSede() {
        return new SedeLar();
    }

}
