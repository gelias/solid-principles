package oo.solid.lsp.sample.veryGood;

import oo.solid.lsp.sample.InvalidAmountException;

public class BaseAccount {

    private double amount;

    public BaseAccount(){
        this.amount = 0;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if(amount <= 0)
            throw new InvalidAmountException();
        this.amount += amount;
    }

    public double getAmount() {
        return amount;
    }
}
