package oo.solid.srp.sample.bad;

import oo.solid.srp.sample.Employee;

public class SalaryCalculator {

    public static final float MEAL_TICKET = 80.00f;

    public Employee calculate(Employee employee){
        calculateDiscountOnFirstTax(employee);
        calculateDiscountOnSecondTax(employee);
        calculateDiscountOnTransportVouchers(employee);
        calculateDiscountOnMealTicket(employee);
        return employee;
    }

    private void calculateDiscountOnMealTicket(Employee employee) {
        employee.setDescontValeRefeicao(MEAL_TICKET);
    }

    private void calculateDiscountOnTransportVouchers(Employee employee) {
        employee.setTransportVoucherDiscount(employee.getBaseSalary() * 0.06f);
    }

    private void calculateDiscountOnSecondTax(Employee employee) {
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

    private void calculateDiscountOnFirstTax(Employee employee) {

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
