package padroesestruturais.proxy;

import java.util.Arrays;
import java.util.List;

public class Detento implements IDetento{

    private Integer id;
    private String nome;
    private String idade;
    private String endereco;
    private String cep;
    private String cpf;


    public Detento(int id){
        this.id = id;
        Detento objeto = BancoDados.getDetento(id);
        this.nome = objeto.nome;
        this.idade = objeto.idade;
        this.endereco = objeto.endereco;
        this.cep = objeto.cep;
        this.cpf = objeto.cpf;
    }

    public Detento(Integer id, String nome, String idade, String endereco, String cep, String cpf){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.cep = cep;
        this.cpf = cpf;
    }

    public Integer getId(){
        return id;
    }

    @Override
    public List<String> obterDadosPublicosDetento(){
        return Arrays.asList(this.nome, this.idade);
    }

    @Override
    public List<String> obterDadosPessoaisDetento(Policial policial){
        return Arrays.asList(this.nome, this.idade, this.endereco, this.cep, this.cpf);
    }

}
