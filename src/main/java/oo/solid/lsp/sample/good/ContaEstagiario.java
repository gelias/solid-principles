package oo.solid.lsp.sample.good;

import oo.solid.lsp.sample.Deposito;
import oo.solid.lsp.sample.Saldo;
import oo.solid.lsp.sample.ValorInvalidoException;

public class ContaEstagiario implements Deposito, Saldo {

    private double saldo;

    @Override
    public void deposita(double valor) throws ValorInvalidoException {
        if(valor <= 0)
            throw new ValorInvalidoException();
        this.saldo += valor;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
