package oo.solid.ocp.sample.bad;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class CalcularIngresso {

    public float calcular(int quantidade){

        float valorTotal = 0f;

        if(hoje().equals(DayOfWeek.MONDAY))
            valorTotal = 17.00f * quantidade;

        if(hoje().equals(DayOfWeek.TUESDAY))
            valorTotal = 18.00f * quantidade;

        if(hoje().equals(DayOfWeek.WEDNESDAY))
            valorTotal = 10.00f * quantidade;

        if(hoje().equals(DayOfWeek.THURSDAY))
            valorTotal = 20.00f * quantidade;

        if(hoje().equals(DayOfWeek.FRIDAY) || hoje().equals(DayOfWeek.SATURDAY) || hoje().equals(DayOfWeek.SUNDAY))
            valorTotal = 25.00f * quantidade;

        return valorTotal;

    }

    private DayOfWeek hoje() {
        return LocalDateTime.now().getDayOfWeek();
    }
}
