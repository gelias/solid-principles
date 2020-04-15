package oo.solid.dip.sample.good;

public class Carro implements Veiculo {

    private final String marca;
    private final String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String getEspecificacoes() {
        return String.format("Marca: %s - Modelo: %s - Ano: %s", this.marca, this.modelo, this.ano);
    }
}
