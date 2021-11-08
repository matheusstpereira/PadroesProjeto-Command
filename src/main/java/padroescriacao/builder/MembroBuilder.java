package padroescriacao.builder;

public class MembroBuilder {

    private Membro membro;

    public MembroBuilder() {
        membro = new Membro();
    }

    public Membro build() {
        if (membro.getId() == 0) {
            throw new IllegalArgumentException("Id inválido");
        }
        if (membro.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return membro;
    }

    public MembroBuilder setId(int id) {
        membro.setId(id);
        return this;
    }

    public MembroBuilder setNome(String nome) {
        membro.setNome(nome);
        return this;
    }

    public MembroBuilder setCpf(String cpf) {
        membro.setCpf(cpf);
        return this;
    }

    public MembroBuilder setEnderecoRua(String enderecoRua) {
        membro.setEnderecoRua(enderecoRua);
        return this;
    }

    public MembroBuilder setEnderecoNumero(int enderecoNumero) {
        membro.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public MembroBuilder setEnderecoBairro(String enderecoBairro) {
        membro.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public MembroBuilder setEnderecoCidade(String enderecoCidade) {
        membro.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public MembroBuilder setCep(String cep) {
        membro.setCep(cep);
        return this;
    }

    public MembroBuilder setEmail(String email) {
        membro.setEmail(email);
        return this;
    }

    public MembroBuilder setTelefone(String telefone) {
        membro.setTelefone(telefone);
        return this;
    }


}
