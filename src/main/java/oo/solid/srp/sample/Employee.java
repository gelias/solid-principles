package oo.solid.srp.sample;

public class Employee {

    private float baseSalary;

    public Employee(float baseSalary){
        this.baseSalary = baseSalary;
    }

    private float firstTaxDiscount;
    private float secondTaxDiscount;
    private float transportVoucherDiscount;
    private float mealTicketDiscount;

    public float getBaseSalary() {
        return this.baseSalary;
    }

    public void setFirstTaxDiscount(float firstTaxDiscount) {
        this.firstTaxDiscount = firstTaxDiscount;
    }

    public void setSecondTaxDiscount(float secondTaxDiscount) {
        this.secondTaxDiscount = secondTaxDiscount;
    }

    public void setTransportVoucherDiscount(float transportVoucherDiscount) {
        this.transportVoucherDiscount = transportVoucherDiscount;
    }

    public void setDescontValeRefeicao(float mealTicketDiscount) {
        this.mealTicketDiscount = mealTicketDiscount;
    }
}
