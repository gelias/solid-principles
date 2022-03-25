package oo.solid.srp.sample.good.secondTax;

import oo.solid.srp.sample.Employee;

public class SecondTax {

    public void calcular(Employee employee) {
        if(employee.getBaseSalary() > 1903.99 && employee.getBaseSalary() <= 2826.65) {
            employee.setSecondTaxDiscount(employee.getBaseSalary() * 0.075f);
            return;
        }

        if(employee.getBaseSalary() <= 3751.05) {
            employee.setSecondTaxDiscount(employee.getBaseSalary() * 0.15f);
            return;
        }

        if(employee.getBaseSalary() <= 4664.68) {
            employee.setSecondTaxDiscount(employee.getBaseSalary() * 0.225f);
            return;
        }

        if(employee.getBaseSalary() > 4664.68) {
            employee.setSecondTaxDiscount(employee.getBaseSalary() * 0.275f);
            return;
        }
    }
}
