package oo.solid.dip.sample.good;

public class TestDrive {

    private String dados;
    private String especificacoes;

    public TestDrive(String dados, String especificacoes) {
        this.dados = dados;
        this.especificacoes = especificacoes;
    }

    public String getDados() {
        return dados;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }
}
