package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BatalhaoTest {

    @Test
    void deveRetornarPoliciais(){
        Batalhao batalhao = new Batalhao();
        batalhao.alocar("Marcos Jose", "TI", "Juiz de Fora");
        batalhao.alocar("Carlos Magno", "RH", "Barbacena");
        batalhao.alocar("Matheus Muniz", "Homicidios", "Santos Dumont");

        List<String> saida = Arrays.asList(
                "Policial{nome='Marcos Jose', departamento='TI', cidade='Juiz de Fora'}",
                "Policial{nome='Carlos Magno', departamento='RH', cidade='Barbacena'}",
                "Policial{nome='Matheus Muniz', departamento='Homicidios', cidade='Santos Dumont'}");

        assertEquals(saida, batalhao.obterPoliciais());
    }

    @Test
    void deveRetornarTotalDepartamentos(){
        Batalhao batalhao = new Batalhao();
        batalhao.alocar("Marcos Jose", "TI", "Juiz de Fora");
        batalhao.alocar("Carlos Magno", "RH", "Barbacena");
        batalhao.alocar("Matheus Muniz", "Homicidios", "Santos Dumont");

        assertEquals(3, DepartamentoFactory.getTotalDepartamentos());
    }


}
