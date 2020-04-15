package oo.solid.srp.sample.good;

import oo.solid.srp.sample.Funcionario;
import oo.solid.srp.sample.good.inss.CalculoINSS;
import oo.solid.srp.sample.good.ir.CalculoIR;
import oo.solid.srp.sample.good.vr.CalculoValeRefeicao;
import oo.solid.srp.sample.good.vt.CalculoValeTransporte;

public class CalcularSalario {

    private CalculoINSS calculoINSS;
    private CalculoIR calculoIR;
    private CalculoValeTransporte calculoValeTransporte;
    private CalculoValeRefeicao calculoValeRefeicao;

    public CalcularSalario(CalculoINSS calculoINSS, CalculoIR calculoIR,CalculoValeTransporte calculoValeTransporte,CalculoValeRefeicao calculoValeRefeicao){
        this.calculoINSS = calculoINSS;
        this.calculoIR = calculoIR;
        this.calculoValeTransporte = calculoValeTransporte;
        this.calculoValeRefeicao = calculoValeRefeicao;
    }

    public Funcionario calculo(Funcionario funcionario){
        calculoINSS.calcular(funcionario);
        calculoIR.calcular(funcionario);
        calculoValeTransporte.calcular(funcionario);
        calculoValeRefeicao.calcular(funcionario);
        return funcionario;
    }

}
