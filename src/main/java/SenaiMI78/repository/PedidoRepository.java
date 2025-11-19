package SenaiMI78.repository;

import SenaiMI78.model.Pedido;

public class PedidoRepository {
    // Lógica de Persistência (RESPONSABILIDADE 3)
    public void salvarNoBancoDeDados(Pedido pedido, double valorFinal) {

// Esta classe mudará se trocarmos de MySQL para NoSQL.

        System.out.println("Pedido " + pedido.getId() + " finalizado (Valor: R$" + valorFinal +
                ") e salvo no BD.");

// ... (código JDBC/JPA)
    }
}
