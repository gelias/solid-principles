package oo.solid.dip.sample.good;

public class PessoaFisica implements Pessoa{
    private String nome;
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String getDados() {
        return String.format("Nome: %s, CPF: %s",this.nome, this.cpf);
    }
}
