package padroesestruturais.proxy;

import java.util.HashMap;
import java.util.Map;

public class BancoDados {

    private static Map<Integer, Detento> detentos = new HashMap<>();

    public static Detento getDetento(Integer id){
        return detentos.get(id);
    }

    public static void addDetento(Detento detento){
        detentos.put(detento.getId(), detento);
    }


}
