package padroescriacao.Prototype;

import org.junit.jupiter.api.Test;
import padroescriacao.prototype.Congregacao;
import padroescriacao.prototype.Membro;

import static org.junit.jupiter.api.Assertions.*;

public class MembroTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Membro membro = new Membro(99, "Membro Teste", "10726245789" ,new Congregacao("Igreja Metodista", "Rua Maquinista Joao Mendes,JF"), "25", "Rua Sao Geraldo", "Costa Carvalho", "Juiz de Fora", "Minas Gerais", "membroteste@gmail.com", "991773945");

        Membro membroClone = membro.clone();
        membroClone.setId(199);
        membroClone.setNome("Membro Clonado");
        membroClone.getCongregacao().setEnderecoCongregacao("Rua Flores");

        assertEquals("Membro{id=99, nome='Membro Teste', cpf='10726245789', congregacao=Congregacao{nomeCongregacao='Igreja Metodista', enderecoCongregacao=Rua Maquinista Joao Mendes,JF}, enderecoNumero='25', enderecoRua='Rua Sao Geraldo', enderecoBairro='Costa Carvalho', enderecoCidade='Juiz de Fora', enderecoEstado='Minas Gerais', email='membroteste@gmail.com', telefone='991773945'}", membro.toString());
        assertEquals("Membro{id=199, nome='Membro Clonado', cpf='10726245789', congregacao=Congregacao{nomeCongregacao='Igreja Metodista', enderecoCongregacao=Rua Flores}, enderecoNumero='25', enderecoRua='Rua Sao Geraldo', enderecoBairro='Costa Carvalho', enderecoCidade='Juiz de Fora', enderecoEstado='Minas Gerais', email='membroteste@gmail.com', telefone='991773945'}", membroClone.toString());
    }

}
