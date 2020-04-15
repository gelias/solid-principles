package oo.solid.srp.sample.bad;

import oo.solid.srp.sample.Funcionario;

public class CalcularSalario {

    public static final float VALOR_DESCONTO_VALE_REFEICAO = 80.00f;

    public Funcionario calculo(Funcionario funcionario){
        calcularINSS(funcionario);
        calcularIR(funcionario);
        calcularDescontoValeTransporte(funcionario);
        calcularDescontoValeRefeicao(funcionario);
        return funcionario;
    }

    private void calcularDescontoValeRefeicao(Funcionario funcionario) {
        funcionario.setDescontValeRefeicao(VALOR_DESCONTO_VALE_REFEICAO);
    }

    private void calcularDescontoValeTransporte(Funcionario funcionario) {
        funcionario.setDescontoValeTransporte(funcionario.getSalarioBase() * 0.06f);
    }

    private void calcularIR(Funcionario funcionario) {
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

    private void calcularINSS(Funcionario funcionario) {

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
