package padroescomportamentais.iterator;
import java.util.Iterator;

public class Relatorio {

    public static Integer contarTotalPoliciais(RH rh) {
        int quantidade = 0;
        for (Iterator a = rh.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

    public static Integer contarPoliciaisAptosAposentadoria(RH rh) {
        int quantidade = 0;
        for (Policial policial : rh) {
            if (policial.isAptoAposentadoria()) {
                quantidade++;
            }
        }
        return quantidade;
    }


}
