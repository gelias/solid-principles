package oo.solid.lsp.sample.good;

import oo.solid.lsp.sample.Deposit;
import oo.solid.lsp.sample.Amount;
import oo.solid.lsp.sample.InvalidAmountException;

public class InternalAccount implements Deposit, Amount {

    private double amount;

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if(amount <= 0)
            throw new InvalidAmountException();
        this.amount += amount;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }
}
