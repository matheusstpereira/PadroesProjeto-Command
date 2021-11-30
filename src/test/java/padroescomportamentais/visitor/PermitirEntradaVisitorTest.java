package padroescomportamentais.visitor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermitirEntradaVisitorTest {

    @Test
    void devePermitirEntradaPessoa() {
        Pessoa pessoa = new Pessoa("Marcos", "Rua Maquinista", "Visitante");
        PermitirEntradaVisitor visitor = new PermitirEntradaVisitor();
        assertEquals("Pessoa: Nome: Marcos,Endereco: Rua Maquinista,Funcao: Visitante.", visitor.visitaPessoa(pessoa));
    }

    @Test
    void devePermitirEntradaPolicial() {
        Policial policial = new Policial("Carlos", "Rua Ferroviarios", "Policial");
        PermitirEntradaVisitor visitor = new PermitirEntradaVisitor();
        assertEquals("Policial: Nome: Carlos,Endereco: Rua Ferroviarios,Funcao: Policial.", visitor.visitaPolicial(policial));
    }

    @Test
    void devePermitirEntradaCarcereiro() {
        Carcereiro carcereiro = new Carcereiro("Claudio", "Rua Flores", "Carcereiro");
        PermitirEntradaVisitor visitor = new PermitirEntradaVisitor();
        assertEquals("Carcereiro: Nome: Claudio,Endereco: Rua Flores,Funcao: Carcereiro.", visitor.visitaCarcereiro(carcereiro));
    }


}
