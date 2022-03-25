package oo.solid.srp.sample.good.firstTax;

import oo.solid.srp.sample.Employee;

public class FirstTax {

    public void calculate(Employee employee) {

        if(employee.getBaseSalary() <= 1045.00) {
            employee.setFirstTaxDiscount(employee.getBaseSalary() * 0.075f);
            return;
        }

        if(employee.getBaseSalary() <= 2098.60) {
            employee.setFirstTaxDiscount(employee.getBaseSalary() * 0.09f);
            return;
        }

        if(employee.getBaseSalary() <= 3134.40) {
            employee.setFirstTaxDiscount(employee.getBaseSalary() * 0.12f);
            return;
        }

        if(employee.getBaseSalary() > 3134.39) {
            employee.setFirstTaxDiscount(employee.getBaseSalary() * 0.14f);
            return;
        }
    }
}
