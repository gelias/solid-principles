package oo.solid.srp.sample.good.vt;

import oo.solid.srp.sample.Funcionario;

public class CalculoValeTransporte {

    public void calcular(Funcionario funcionario) {
        funcionario.setDescontoValeTransporte(funcionario.getSalarioBase() * 0.06f);
    }
}
