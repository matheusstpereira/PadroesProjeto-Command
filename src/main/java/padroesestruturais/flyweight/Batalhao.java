package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Batalhao {

    private List<Policial> policiais = new ArrayList<>();

    public void alocar(String nomePolicial, String nomeDepartamento, String cidade){
        Departamento departamento = DepartamentoFactory.getDepartamento(nomeDepartamento, cidade);
        Policial policial = new Policial(nomePolicial, departamento);
        policiais.add(policial);
    }

    public List<String> obterPoliciais(){
        List<String> saida = new ArrayList<String>();
        for (Policial policial : this.policiais){
            saida.add(policial.obterPolicial());
        }
        return saida;
    }

}
