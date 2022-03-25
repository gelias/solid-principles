package oo.solid.srp.sample.good;

import oo.solid.srp.sample.Employee;
import oo.solid.srp.sample.good.firstTax.FirstTax;
import oo.solid.srp.sample.good.secondTax.SecondTax;
import oo.solid.srp.sample.good.transport.MealTicket;
import oo.solid.srp.sample.good.meal.TransportVoucher;

public class CalculateSalary {

    private FirstTax firstTax;
    private SecondTax secondTax;
    private TransportVoucher transportVoucher;
    private MealTicket mealTicket;

    public CalculateSalary(FirstTax firstTax, SecondTax secondTax, TransportVoucher transportVoucher, MealTicket mealTicket){
        this.firstTax = firstTax;
        this.secondTax = secondTax;
        this.transportVoucher = transportVoucher;
        this.mealTicket = mealTicket;
    }

    public Employee calculate(Employee employee){
        firstTax.calculate(employee);
        secondTax.calcular(employee);
        transportVoucher.calcular(employee);
        mealTicket.calcular(employee);
        return employee;
    }

}
