package oo.solid.srp.sample.good.vr;

import oo.solid.srp.sample.Funcionario;

public class CalculoValeRefeicao {

    public static final float VALOR_DESCONTO_VALE_REFEICAO = 80.00f;

    public void calcular(Funcionario funcionario) {
        funcionario.setDescontValeRefeicao(VALOR_DESCONTO_VALE_REFEICAO);
    }
}
