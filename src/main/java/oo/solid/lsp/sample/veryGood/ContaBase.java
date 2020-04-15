package oo.solid.lsp.sample.veryGood;

import oo.solid.lsp.sample.ValorInvalidoException;

public class ContaBase {

    private double saldo;

    public ContaBase(){
        this.saldo = 0;
    }

    public void deposita(double valor) throws ValorInvalidoException {
        if(valor <= 0)
            throw new ValorInvalidoException();
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
