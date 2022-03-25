package oo.solid.lsp.sample.bad;

import oo.solid.lsp.sample.InvalidAmountException;

public class EmployeeBaseAccount {

    private double balance;

    public EmployeeBaseAccount(){
        this.balance = 0;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if(amount <= 0)
            throw new InvalidAmountException();
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void yield() {
        this.balance *= 1.1;
    }
}