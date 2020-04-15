package oo.solid.lsp.sample;

import oo.solid.lsp.sample.ValorInvalidoException;

public interface Deposito {

    void deposita(double valor) throws ValorInvalidoException;
}
