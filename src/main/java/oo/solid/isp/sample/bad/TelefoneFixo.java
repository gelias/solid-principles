package oo.solid.isp.sample.bad;

import oo.solid.isp.sample.TelefoneFixoNaoTiraFotoException;

public class TelefoneFixo implements Telefone {
    @Override
    public void tocar() {
     // Como um telefone fixo tocaria
    }

    @Override
    public void discar() {
        // Da forma que o fixo faria
    }

    @Override
    public void tirarFoto() {
        throw new TelefoneFixoNaoTiraFotoException();
    }
}
