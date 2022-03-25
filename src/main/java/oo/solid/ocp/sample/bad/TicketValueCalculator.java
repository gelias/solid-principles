package oo.solid.ocp.sample.bad;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class TicketValueCalculator {

    public float calculate(int quantity){

        float amount = 0f;

        if(today().equals(DayOfWeek.MONDAY))
            amount = 17.00f * quantity;

        if(today().equals(DayOfWeek.TUESDAY))
            amount = 18.00f * quantity;

        if(today().equals(DayOfWeek.WEDNESDAY))
            amount = 10.00f * quantity;

        if(today().equals(DayOfWeek.THURSDAY))
            amount = 20.00f * quantity;

        if(today().equals(DayOfWeek.FRIDAY) || today().equals(DayOfWeek.SATURDAY) || today().equals(DayOfWeek.SUNDAY))
            amount = 25.00f * quantity;

        return amount;

    }

    private DayOfWeek today() {
        return LocalDateTime.now().getDayOfWeek();
    }
}
