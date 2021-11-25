package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolicialTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Policial policial = new Policial();
        policial.setSalBruto(5000.0);
        policial.setFgts(400.0); //FGTS representa 8% do salario
        policial.setInss(700.0); //Inss representa 14% do salario
        policial.setIrpf(360.0); //IRPF representa 7% do salario

        assertEquals(3540.0, policial.calcularSalarioLiquido());
    }

}