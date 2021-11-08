package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PolicialTest {

    @Test
    void deveNotificarUmPolicial(){
        Ocorrencia ocorrencia = new Ocorrencia(1, "Maria", "Fatima", "Maquinista Joao Mendes", "120", "roubo");
        Policial policial = new Policial("Policial 1", "123456789");
        policial.escalar(ocorrencia);
        ocorrencia.publicarOcorrencia();
        assertEquals("Policial 1, você foi escalado para a Ocorrencia{id=1, nomeSolicitante=Maria, bairro=Fatima, rua=Maquinista Joao Mendes, numero=120, motivo=roubo}", policial.getUltimaOcorrencia());
    }

    @Test
    void deveNotificarPoliciais(){
        Ocorrencia ocorrencia = new Ocorrencia(1, "Maria", "Fatima", "Maquinista Joao Mendes", "120", "roubo");
        Policial policial1 = new Policial("Policial 1", "123456789");
        Policial policial2 = new Policial("Policial 2", "987654321");
        policial1.escalar(ocorrencia);
        policial2.escalar(ocorrencia);
        ocorrencia.publicarOcorrencia();
        assertEquals("Policial 1, você foi escalado para a Ocorrencia{id=1, nomeSolicitante=Maria, bairro=Fatima, rua=Maquinista Joao Mendes, numero=120, motivo=roubo}", policial1.getUltimaOcorrencia());
        assertEquals("Policial 2, você foi escalado para a Ocorrencia{id=1, nomeSolicitante=Maria, bairro=Fatima, rua=Maquinista Joao Mendes, numero=120, motivo=roubo}", policial2.getUltimaOcorrencia());
    }

    @Test
    void naoDeveNotificarPolicial(){
        Ocorrencia ocorrencia = new Ocorrencia(1, "Maria", "Fatima", "Maquinista Joao Mendes", "120", "roubo");
        Policial policial = new Policial("Policial 1", "123456789");
        ocorrencia.publicarOcorrencia();
        assertEquals(null, policial.getUltimaOcorrencia());
    }


    @Test
    void deveNotificarPolicialOcorrencia1(){
        Ocorrencia ocorrencia1 = new Ocorrencia(1, "Maria", "Fatima", "Maquinista Joao Mendes", "120", "roubo");
        Ocorrencia ocorrencia2 = new Ocorrencia(2, "Joao", "Costa", "Ferroviarios", "64", "homicidio");
        Policial policial1 = new Policial("Policial 1", "123456789");
        Policial policial2 = new Policial("Policial 2", "987654321");
        policial1.escalar(ocorrencia1);
        policial2.escalar(ocorrencia2);
        ocorrencia1.publicarOcorrencia();
        assertEquals("Policial 1, você foi escalado para a Ocorrencia{id=1, nomeSolicitante=Maria, bairro=Fatima, rua=Maquinista Joao Mendes, numero=120, motivo=roubo}", policial1.getUltimaOcorrencia());
        assertEquals(null, policial2.getUltimaOcorrencia());

    }


}
