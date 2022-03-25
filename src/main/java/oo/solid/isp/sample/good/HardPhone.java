package oo.solid.isp.sample.good;

import oo.solid.isp.sample.good.telephony.Telephony;

public class HardPhone implements Telephony {
    @Override
    public void ring() {
        // the way a hard phone rings
    }

    @Override
    public void redial() {
        // redial the last number
    }
}
