package oo.solid.srp.sample.good.meal;

import oo.solid.srp.sample.Employee;

public class TransportVoucher {

    public void calcular(Employee employee) {
        employee.setTransportVoucherDiscount(employee.getBaseSalary() * 0.06f);
    }
}
