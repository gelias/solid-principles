package oo.solid.isp.sample.bad;

public class HardPhone implements Phone {
    @Override
    public void ring() {
     // Customize the hard phone ring
    }

    @Override
    public void dial(String number) {
        // dial a number
    }

    @Override
    public void redial() {
        // How the hard phone will redial
    }

    @Override
    public void takePicture() {
        throw new HardPhoneDoesNotTakePictureException();
    }
}
