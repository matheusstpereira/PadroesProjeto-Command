package padroesestruturais.facade;

public class PolicialFacade {

    public static boolean verificarPendencias(Policial policial){
        if (Escolaridade.getInstancia().verificarPolicialComPendencia(policial)){
            return false;
        }
        if (Nacionalidade.getInstancia().verificarPolicialComPendencia(policial)){
            return false;
        }
        if (ObrigacoesEleitorais.getInstancia().verificarPolicialComPendencia(policial)){
            return false;
        }
        if (ObrigacoesMilitares.getInstancia().verificarPolicialComPendencia(policial)){
            return false;
        }
        return true;
    }
}
