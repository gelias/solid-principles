package oo.solid.srp.sample.good.transport;

import oo.solid.srp.sample.Employee;

public class MealTicket {

    public static final float VALOR_DESCONTO_VALE_REFEICAO = 80.00f;

    public void calcular(Employee employee) {
        employee.setDescontValeRefeicao(VALOR_DESCONTO_VALE_REFEICAO);
    }
}
