package oo.solid.lsp.sample.veryGood;

import oo.solid.lsp.sample.Rendimento;

public class ContaGerente extends ContaBase implements Rendimento {

    @Override
    public void rende() {
        // implementação de rendimentos para gerente
    }
}
