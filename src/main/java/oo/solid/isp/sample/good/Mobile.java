package oo.solid.isp.sample.good;

import oo.solid.isp.sample.good.smartphone.SmartPhone;
import oo.solid.isp.sample.good.telephony.Telephony;

public class Mobile implements Telephony, SmartPhone {

    @Override
    public void takePicture() {
        // take a picture
    }

    @Override
    public void ring() {

    }

    @Override
    public void redial() {

    }
}
