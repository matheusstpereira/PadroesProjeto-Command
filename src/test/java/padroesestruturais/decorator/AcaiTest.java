package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AcaiTest {

    @Test
    void deveRetornarPrecoAcai350(){
        Acai acai = new Acai350(5.0f);
        assertEquals(5.0f, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcai500(){
        Acai acai = new Acai500(8.0f);
        assertEquals(8.0f, acai.getPreco());
    }


    @Test
    void deveRetornarPrecoAcai350ComChocolate(){
        Acai acai = new Chocolate(new Acai350(5.0f));
        assertEquals(7.0f, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcai350ComMorango(){
        Acai acai = new Morango(new Acai350(5.0f));
        assertEquals(7.0f, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcai350ComNinho(){
        Acai acai = new Ninho(new Acai350(5.0f));
        assertEquals(6.0f, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcai350ComChocolateMorangoENinho(){
        Acai acai = new Chocolate(new Morango(new Ninho(new Acai350(5.0f))));
        assertEquals(10.0f, acai.getPreco());
    }

    //

    @Test
    void deveRetornarPrecoAcai500ComChocolate(){
        Acai acai = new Chocolate(new Acai500(8.0f));
        assertEquals(10.0f, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcai500ComMorango(){
        Acai acai = new Morango(new Acai500(8.0f));
        assertEquals(10.0f, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcai500ComNinho(){
        Acai acai = new Ninho(new Acai350(8.0f));
        assertEquals(9.0f, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcai500ComChocolateMorangoENinho(){
        Acai acai = new Chocolate(new Morango(new Ninho(new Acai350(8.0f))));
        assertEquals(13.0f, acai.getPreco());
    }








}
