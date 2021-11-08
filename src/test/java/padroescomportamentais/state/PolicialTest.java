package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolicialTest {

    Policial policial;

    @BeforeEach
    public void setUp(){
        policial = new Policial();
    }

    //Policial Ingressado

    @Test
    public void naoDeveIngressarPolicialIngressado(){
        policial.setEstado(PolicialEstadoIngressado.getInstance());
        assertEquals("Ingresso não realizado", policial.ingressar());
    }

    @Test
    public void devePromoverPolicialIngressado(){
        policial.setEstado(PolicialEstadoIngressado.getInstance());
        assertEquals("Promoção realizada", policial.promover());
    }

    @Test
    public void deveAfastarPolicialIngressado(){
        policial.setEstado(PolicialEstadoIngressado.getInstance());
        assertEquals("Afastamento realizado", policial.afastar());
    }

    @Test
    public void deveTransferirPolicialIngressado(){
        policial.setEstado(PolicialEstadoIngressado.getInstance());
        assertEquals("Transferência realizada", policial.transferir());
    }

    @Test
    public void deveDemitirPolicialIngressado(){
        policial.setEstado(PolicialEstadoIngressado.getInstance());
        assertEquals("Demissão realizada", policial.demitir());
    }

    //Policial Promovido

    @Test
    public void deveIngressarPolicialPromovido(){
        policial.setEstado(PolicialEstadoPromovido.getInstance());
        assertEquals("Ingresso realizado", policial.ingressar());
    }

    @Test
    public void naoDevePromoverPolicialPromovido(){
        policial.setEstado(PolicialEstadoPromovido.getInstance());
        assertEquals("Promoção não realizada", policial.promover());
    }

    @Test
    public void naoDeveAfastarPolicialPromovido(){
        policial.setEstado(PolicialEstadoPromovido.getInstance());
        assertEquals("Afastamento não realizado", policial.afastar());
    }

    @Test
    public void naoDeveTransferirPolicialPromovido(){
        policial.setEstado(PolicialEstadoPromovido.getInstance());
        assertEquals("Transferência não realizada", policial.transferir());
    }

    @Test
    public void naoDeveDemitirPolicialPromovido(){
        policial.setEstado(PolicialEstadoPromovido.getInstance());
        assertEquals("Demissão não realizada", policial.demitir());
    }


    //Policial Afastado

    @Test
    public void deveIngressarPolicialAfastado(){
        policial.setEstado(PolicialEstadoAfastado.getInstance());
        assertEquals("Ingresso realizado", policial.ingressar());
    }

    @Test
    public void naoDevePromoverPolicialAfastado(){
        policial.setEstado(PolicialEstadoAfastado.getInstance());
        assertEquals("Promoção não realizada", policial.promover());
    }

    @Test
    public void naoDeveAfastarPolicialAfastado(){
        policial.setEstado(PolicialEstadoAfastado.getInstance());
        assertEquals("Afastamento não realizado", policial.afastar());
    }

    @Test
    public void naoDeveTransferirPolicialAfastado(){
        policial.setEstado(PolicialEstadoAfastado.getInstance());
        assertEquals("Transferência não realizada", policial.transferir());
    }

    @Test
    public void naoDeveDemitirPolicialAfastado(){
        policial.setEstado(PolicialEstadoAfastado.getInstance());
        assertEquals("Demissão não realizada", policial.demitir());
    }

    //Policial Transferido

    @Test
    public void naoDeveIngressarPolicialTransferido(){
        policial.setEstado(PolicialEstadoTransferido.getInstance());
        assertEquals("Ingresso não realizado", policial.ingressar());
    }

    @Test
    public void naoDevePromoverPolicialTransferido(){
        policial.setEstado(PolicialEstadoTransferido.getInstance());
        assertEquals("Promoção não realizada", policial.promover());
    }

    @Test
    public void naoDeveAfastarPolicialTransferido(){
        policial.setEstado(PolicialEstadoTransferido.getInstance());
        assertEquals("Afastamento não realizado", policial.afastar());
    }

    @Test
    public void naoDeveTransferirPolicialTransferido(){
        policial.setEstado(PolicialEstadoTransferido.getInstance());
        assertEquals("Transferência não realizada", policial.transferir());
    }

    @Test
    public void naoDeveDemitirPolicialTransferido(){
        policial.setEstado(PolicialEstadoTransferido.getInstance());
        assertEquals("Demissão não realizada", policial.demitir());
    }



    //Policial Demitido

    @Test
    public void naoDeveIngressarPolicialDemitido(){
        policial.setEstado(PolicialEstadoDemitido.getInstance());
        assertEquals("Ingresso não realizado", policial.ingressar());
    }

    @Test
    public void naoDevePromoverPolicialDemitido(){
        policial.setEstado(PolicialEstadoDemitido.getInstance());
        assertEquals("Promoção não realizada", policial.promover());
    }

    @Test
    public void naoDeveAfastarPolicialDemitido(){
        policial.setEstado(PolicialEstadoDemitido.getInstance());
        assertEquals("Afastamento não realizado", policial.afastar());
    }

    @Test
    public void naoDeveTransferirPolicialDemitido(){
        policial.setEstado(PolicialEstadoDemitido.getInstance());
        assertEquals("Transferência não realizada", policial.transferir());
    }

    @Test
    public void naoDeveDemitirPolicialDemitido(){
        policial.setEstado(PolicialEstadoDemitido.getInstance());
        assertEquals("Demissão não realizada", policial.demitir());
    }

}
