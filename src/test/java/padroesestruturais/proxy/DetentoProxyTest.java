package padroesestruturais.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class DetentoProxyTest {

    @BeforeEach
    void setUp(){
        BancoDados.addDetento(new Detento(1, "Carlos", "25 anos", "Centro, Juiz de Fora", "3611047", "10745147878"));
    }

    @Test
    void deveRetornarDadosPublicosDetento(){
        DetentoProxy detento = new DetentoProxy(1);
        assertEquals(Arrays.asList("Carlos", "25 anos"), detento.obterDadosPublicosDetento());
    }

    @Test
    void deveRetornarDadosPessoaisDetento(){
        Policial policial = new Policial("Jose", true);
        DetentoProxy detento = new DetentoProxy(1);
        assertEquals(Arrays.asList("Carlos", "25 anos", "Centro, Juiz de Fora", "3611047", "10745147878"), detento.obterDadosPessoaisDetento(policial));
    }

    @Test
    void deveRetornarErroPolicialSemPermissao(){
        try{
            Policial policial = new Policial("Jose", false);
            DetentoProxy detento = new DetentoProxy(1);

            detento.obterDadosPessoaisDetento(policial);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Policial não possui permissão", e.getMessage());
        }
    }

}
