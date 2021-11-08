package padroescriacao.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IgrejaTest {

    @Test
    public void deveRetornarNomeIgreja(){
        Igreja.getInstance().setNomeIgreja("Caminho da Graca");
        assertEquals("Caminho da Graca", Igreja.getInstance().getNomeIgreja());
    }

    @Test
    public void deveRetornarPastorIgreja() {
        Igreja.getInstance().setPastorIgreja("Antonio Fernandes");
        assertEquals("Antonio Fernandes", Igreja.getInstance().getPastorIgreja());
    }

    @Test
    public void deveRetornarEnderecoIgreja() {
        Igreja.getInstance().setEnderecoIgreja("Rua Maquinista Joao Mendes, Numero 120");
        assertEquals("Rua Maquinista Joao Mendes, Numero 120", Igreja.getInstance().getEnderecoIgreja());
    }

}
