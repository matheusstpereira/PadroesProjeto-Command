package padroescriacao.Builder;

import padroescriacao.builder.Membro;
import padroescriacao.builder.MembroBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MembroBuilderTest {

    @Test
    void deveRetornarExcecaoParaMembroSemId() {
        try {
            MembroBuilder membroBuilder = new MembroBuilder();
            Membro membro = membroBuilder
                    .setNome("Marcio Favaro")
                    .setCpf("1054789578")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Id inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaMembroSemNome() {
        try {
            MembroBuilder membroBuilder = new MembroBuilder();
            Membro membro = membroBuilder
                    .setId(1)
                    .setCpf("1054789578")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarMembroValido() {
        MembroBuilder membroBuilder = new MembroBuilder();
        Membro membro = membroBuilder
                .setId(1)
                .setNome("Marcio Favaro")
                .setCpf("1054789578")
                .build();

        assertNotNull(membro);
    }


}
