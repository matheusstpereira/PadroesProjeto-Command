package padroescriacao.AbstractFactory;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void deveEmitirCelulaLar() {
        FabricaAbstrata fabrica = new FabricaLar();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Celula Lar", pessoa.emitirCelula());
    }

    @Test
    void deveEmitirCelulaPresencial() {
        FabricaAbstrata fabrica = new FabricaPresencial();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Celula Presencial", pessoa.emitirCelula());
    }

    @Test
    void deveEmitirSedeLar() {
        FabricaAbstrata fabrica = new FabricaLar();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Sede Lar", pessoa.emitirSede());
    }

    @Test
    void deveEmitirSedePresencial() {
        FabricaAbstrata fabrica = new FabricaPresencial();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Sede Presencial", pessoa.emitirSede());
    }

}
