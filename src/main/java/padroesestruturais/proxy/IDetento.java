package padroesestruturais.proxy;
import java.util.List;
public interface IDetento {

    List<String> obterDadosPublicosDetento();
    List<String> obterDadosPessoaisDetento(Policial policial);

}
