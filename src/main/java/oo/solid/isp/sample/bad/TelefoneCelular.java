package oo.solid.isp.sample.bad;

public class TelefoneCelular implements Telefone {

    @Override
    public void tocar() {
        // customizar o toque
    }

    @Override
    public void discar() {
        // realiza a ligação da melhor forma possível
    }

    @Override
    public void tirarFoto() {
        // take a picture ;-)
    }
}
