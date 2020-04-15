package oo.solid.srp.sample;

public class Funcionario {

    private float salarioBase;

    public Funcionario(float salarioBase){
        this.salarioBase = salarioBase;
    }

    private float descontoINSS;
    private float descontoIR;
    private float descontoValeTransporte;
    private float valorDescontoValeRefeicao;

    public float getSalarioBase() {
        return this.salarioBase;
    }

    public void setDescontoINSS(float descontoINSS) {
        this.descontoINSS = descontoINSS;
    }

    public void setDescontoIR(float descontoIR) {
        this.descontoIR = descontoIR;
    }

    public void setDescontoValeTransporte(float descontoValeTransporte) {
        this.descontoValeTransporte = descontoValeTransporte;
    }

    public void setDescontValeRefeicao(float valorDescontoValeRefeicao) {
        this.valorDescontoValeRefeicao = valorDescontoValeRefeicao;
    }
}
