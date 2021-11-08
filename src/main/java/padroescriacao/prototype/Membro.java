package padroescriacao.prototype;

public class Membro implements Cloneable{

    private String nome;
    private String cpf;
    private Congregacao congregacao;
    private String EnderecoNumero;
    private String EnderecoRua;
    private String EnderecoBairro;
    private String EnderecoCidade;
    private String EnderecoEstado;
    private String email;
    private String telefone;

    public Membro(int id, String nome, String cpf, Congregacao congregacao ,String enderecoNumero, String enderecoRua, String enderecoBairro, String enderecoCidade, String enderecoEstado, String email, String telefone){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.congregacao = congregacao;
        this.EnderecoNumero = enderecoNumero;
        this.EnderecoRua = enderecoRua;
        this.EnderecoBairro = enderecoBairro;
        this.EnderecoCidade = enderecoCidade;
        this.EnderecoEstado = enderecoEstado;
        this.email = email;
        this.telefone = telefone;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Congregacao getCongregacao() {
        return congregacao;
    }

    public void setCongregacao(Congregacao congregacao) {
        this.congregacao = congregacao;
    }

    public String getEnderecoNumero() {
        return EnderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        EnderecoNumero = enderecoNumero;
    }

    public String getEnderecoRua() {
        return EnderecoRua;
    }

    public void setEnderecoRua(String enderecoRua) {
        EnderecoRua = enderecoRua;
    }

    public String getEnderecoBairro() {
        return EnderecoBairro;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        EnderecoBairro = enderecoBairro;
    }

    public String getEnderecoCidade() {
        return EnderecoCidade;
    }

    public void setEnderecoCidade(String enderecoCidade) {
        EnderecoCidade = enderecoCidade;
    }

    public String getEnderecoEstado() {
        return EnderecoEstado;
    }

    public void setEnderecoEstado(String enderecoEstado) {
        EnderecoEstado = enderecoEstado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public Membro clone() throws CloneNotSupportedException {
        Membro membroClone = (Membro) super.clone();
        membroClone.congregacao = (Congregacao) membroClone.congregacao.clone();
        return membroClone;
    }

    @Override
    public String toString() {
        return "Membro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", congregacao=" + congregacao +
                ", enderecoNumero='" + EnderecoNumero + '\'' +
                ", enderecoRua='" + EnderecoRua + '\'' +
                ", enderecoBairro='" + EnderecoBairro + '\'' +
                ", enderecoCidade='" + EnderecoCidade + '\'' +
                ", enderecoEstado='" + EnderecoEstado + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }


}
