package oo.solid.isp.sample.bad;

public class Mobile implements Phone {

    @Override
    public void ring() {
        // ring customization
    }

    @Override
    public void dial(String number) {
       // dial a number
    }

    @Override
    public void redial() {
        // Call the last number
    }

    @Override
    public void takePicture() {
        // take a picture ;-)
    }
}
