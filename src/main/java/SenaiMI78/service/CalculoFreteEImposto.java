package SenaiMI78.service;

import SenaiMI78.model.Pedido;

public class CalculoFreteEImposto {
    public double calcularFrete(Pedido pedido){
        double frete = 0.0;

        if (pedido.getValorTotal() < 500.00) {
            frete = 50.00;
        } else {
            frete = 0.0; // Frete grátis
        }

        double impostos = pedido.getValorTotal() * 0.15; // 15% de imposto fixo
        double valorFinal = pedido.getValorTotal() + frete + impostos;

        return valorFinal;
    }
}
