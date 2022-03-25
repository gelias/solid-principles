package oo.solid.lsp.sample.good;

import oo.solid.lsp.sample.Amount;
import oo.solid.lsp.sample.Deposit;
import oo.solid.lsp.sample.Yield;
import oo.solid.lsp.sample.InvalidAmountException;

public class EmployeeBaseAccount implements Deposit, Yield, Amount {

    private double amount;

    public EmployeeBaseAccount(){
        this.amount = 0;
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if(amount <= 0)
            throw new InvalidAmountException();
        this.amount += amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void yield() {
        this.amount *= 1.1;
    }
}
