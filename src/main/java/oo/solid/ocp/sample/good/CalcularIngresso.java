package oo.solid.ocp.sample.good;

import oo.solid.ocp.sample.DiaDaSemana;

public class CalcularIngresso {

    public float calcular(DiaDaSemana diaDaSemana, int quantidade){
        return diaDaSemana.getValorIngresso() * quantidade;
    }
}
