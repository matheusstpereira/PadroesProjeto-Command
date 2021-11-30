package padroescomportamentais.mediator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveSolicitarAuxilioFurto(){
        Pessoa pessoa = new Pessoa();
        assertEquals("A Central de Atendimento recebeu sua solicitação. " + "Viatura se deslocando ao local para auxilio a situação de Furto: Por favor, me ajude com uma situação de furto na Rua X", pessoa.solicitarAuxilioFurto("Por favor, me ajude com uma situação de furto na Rua X"));
    }

    @Test
    void deveSolicitarAuxilioHomicidio(){
        Pessoa pessoa = new Pessoa();
        assertEquals("A Central de Atendimento recebeu sua solicitação. " + "Viatura se deslocando ao local para auxilio a situação de Homicidio: Por favor, me ajude com uma situação de homicidio na Rua X", pessoa.solicitarAuxilioHomocidio("Por favor, me ajude com uma situação de homicidio na Rua X"));
    }

    @Test
    void deveSolicitarAuxilioAgressao(){
        Pessoa pessoa = new Pessoa();
        assertEquals("A Central de Atendimento recebeu sua solicitação. " + "Viatura se deslocando ao local para auxilio a situação de Agressao: Por favor, me ajude com uma situação de agressao na Rua X", pessoa.solicitarAuxilioAgressao("Por favor, me ajude com uma situação de agressao na Rua X"));
    }


}
