package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TecladoTest {

    @Test
    void deveRetornarDirecionalTeclado(){
        Teclado teclado = new Teclado();
        teclado.setEntrada("Cima");

        assertEquals("Cima", teclado.getEntrada());
    }


    @Test
    void deveRetornarGrausAnalogicaCimaPlaystation(){
        Teclado teclado = new Teclado();
        teclado.setEntrada("Cima");

        assertEquals(0.0f, teclado.getGraus());
    }


    @Test
    void deveRetornarGrausAnalogicaDireitaPlaystation(){
        Teclado teclado = new Teclado();
        teclado.setEntrada("Direita");

        assertEquals(90.0f, teclado.getGraus());
    }

    @Test
    void deveRetornarGrausAnalogicaBaixoPlaystation(){
        Teclado teclado = new Teclado();
        teclado.setEntrada("Baixo");

        assertEquals(180.0f, teclado.getGraus());
    }

    @Test
    void deveRetornarGrausAnalogicaEsquerdaPlaystation(){
        Teclado teclado = new Teclado();
        teclado.setEntrada("Esquerda");

        assertEquals(270.0f, teclado.getGraus());
    }

}
