package oo.solid.srp.sample.good.ir;

import oo.solid.srp.sample.Funcionario;

public class CalculoIR {

    public void calcular(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 1903.99 && funcionario.getSalarioBase() <= 2826.65) {
            funcionario.setDescontoIR(funcionario.getSalarioBase() * 0.075f);
            return;
        }

        if(funcionario.getSalarioBase() <= 3751.05) {
            funcionario.setDescontoIR(funcionario.getSalarioBase() * 0.15f);
            return;
        }

        if(funcionario.getSalarioBase() <= 4664.68) {
            funcionario.setDescontoIR(funcionario.getSalarioBase() * 0.225f);
            return;
        }

        if(funcionario.getSalarioBase() > 4664.68) {
            funcionario.setDescontoIR(funcionario.getSalarioBase() * 0.275f);
            return;
        }
    }
}
