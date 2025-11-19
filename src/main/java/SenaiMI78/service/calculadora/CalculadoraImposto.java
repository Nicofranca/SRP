package SenaiMI78.service.calculadora;

import SenaiMI78.model.Pedido;

public class CalculadoraImposto {
    public double valorFinal(Pedido pedido, double frete){

        double impostos = pedido.getValorTotal() * 0.15; // 15% de imposto fixo
        double valorFinal = pedido.getValorTotal() + frete + impostos;

        return valorFinal;
    }
}
