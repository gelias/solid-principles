package oo.solid.ocp.sample.good;

import oo.solid.ocp.sample.good.days.DayOfWeek;

public class TicketValueCalculator {

    public float calculate(DayOfWeek dayOfWeek, int quantity){
        return dayOfWeek.getTicketValue() * quantity;
    }
}
