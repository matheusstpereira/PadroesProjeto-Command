package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DepartamentoFactory {
    private static Map<String, Departamento> departamentos = new HashMap<>();

    public static Departamento getDepartamento(String nome, String cidade){
        Departamento departamento = departamentos.get(nome);
        if (departamento == null){
            departamento = new Departamento(nome, cidade);
            departamentos.put(nome, departamento);
        }
        return departamento;
    }

    public static int getTotalDepartamentos(){
        return departamentos.size();
    }


}
