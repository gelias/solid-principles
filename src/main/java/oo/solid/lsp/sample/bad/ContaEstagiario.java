package oo.solid.lsp.sample.bad;

import oo.solid.lsp.sample.EstagiarioNaoTemRendimentosException;

public class ContaEstagiario extends ContaBaseFuncionario{

    @Override
    public void rende() {
        throw new EstagiarioNaoTemRendimentosException();
    }
}
