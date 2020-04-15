package oo.solid.lsp.sample.good;

import oo.solid.lsp.sample.Deposito;
import oo.solid.lsp.sample.Rendimento;
import oo.solid.lsp.sample.ValorInvalidoException;

public class ClasseBaseFuncionario implements Deposito, Rendimento {

    private double saldo;

    public ClasseBaseFuncionario(){
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

    public void rende() {
        this.saldo *= 1.1;
    }
}
