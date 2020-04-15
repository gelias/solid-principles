package oo.solid.srp.sample.good.inss;

import oo.solid.srp.sample.Funcionario;

public class CalculoINSS {

    public void calcular(Funcionario funcionario) {

        if(funcionario.getSalarioBase() <= 1045.00) {
            funcionario.setDescontoINSS(funcionario.getSalarioBase() * 0.075f);
            return;
        }

        if(funcionario.getSalarioBase() <= 2098.60) {
            funcionario.setDescontoINSS(funcionario.getSalarioBase() * 0.09f);
            return;
        }

        if(funcionario.getSalarioBase() <= 3134.40) {
            funcionario.setDescontoINSS(funcionario.getSalarioBase() * 0.12f);
            return;
        }

        if(funcionario.getSalarioBase() > 3134.39) {
            funcionario.setDescontoINSS(funcionario.getSalarioBase() * 0.14f);
            return;
        }
    }
}
