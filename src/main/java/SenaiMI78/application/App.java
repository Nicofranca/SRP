package SenaiMI78.application;

import SenaiMI78.model.Pedido;
import SenaiMI78.service.ProcessadorDePedido;

public class App {
    public static void main(String[] args) {
        ProcessadorDePedido processador = new ProcessadorDePedido();
        Pedido pedido1 = new Pedido("PED-123", 600.00, 5, "cliente@email.com");
        try {
            double total = processador.processar(pedido1);
            System.out.println("Resultado final: Pedido processado com sucesso! Total: R$" +
                    total);
        } catch (Exception e) {
            System.out.println("Erro ao processar pedido: " + e.getMessage());
        }
    }
}
