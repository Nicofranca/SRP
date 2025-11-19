package SenaiMI78.service.calculadora;

import SenaiMI78.model.Pedido;

public class CalculadoraFrete {
    public double calcularFrete(Pedido pedido){
        double frete = 0.0;

        if (pedido.getValorTotal() < 500.00) {
            frete = 50.00;
        } else {
            frete = 0.0; // Frete grátis
        }

        return frete;
    }
}
