package padroescriacao.builder;

public class Membro {

    private int id;
    private String nome;
    private String cpf;
    private int enderecoNumero;
    private String enderecoRua;
    private String enderecoBairro;
    private String enderecoCidade;
    private String cep;
    private String email;
    private String telefone;

    public Membro(){
        this.id = 0;
        this.nome = "";
    }

    public int getId() {
        return id;
    }

    public Membro setId(int id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Membro setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Membro setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public int getEnderecoNumero() {
        return enderecoNumero;
    }

    public Membro setEnderecoNumero(int enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
        return this;
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public Membro setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
        return this;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public Membro setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
        return this;
    }

    public String getEnderecoCidade() {
        return enderecoCidade;
    }

    public Membro setEnderecoCidade(String enderecoCidade) {
        this.enderecoCidade = enderecoCidade;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public Membro setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Membro setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Membro setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }



}
