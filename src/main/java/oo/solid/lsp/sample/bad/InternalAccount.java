package oo.solid.lsp.sample.bad;

import oo.solid.lsp.sample.InternalHasNoYieldException;

public class InternalAccount extends EmployeeBaseAccount {

    @Override
    public void yield() {
        throw new InternalHasNoYieldException();
    }
}
