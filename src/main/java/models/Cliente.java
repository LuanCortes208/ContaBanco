package models;

import enums.TipoConta;

public final class Cliente extends User{
    private final String cpf;
    private String telefone;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private TipoConta tipo;

    public Cliente(Long id, String nome, String email, String senha, String cpf, String telefone,
                   String endereco, String bairro, String cidade, String uf, String cep, TipoConta tipo) {
        super(id, nome, email, senha);
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.tipo = tipo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public TipoConta getTipo() {return tipo;}

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cliente cliente)) return false;
        if (!super.equals(o)) return false;

        return cpf.equals(cliente.cpf);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + cpf.hashCode();
        return result;
    }
}
