package SenaiMI78.service.validador;

import SenaiMI78.model.Pedido;

public class ValidacaoQuantidade {
    public void validacaoQuantidade(Pedido pedido) throws Exception{

        if (pedido.getQuantidadeItens() > 100) {
            throw new Exception("Estoque insuficiente para a quantidade solicitada.");
        }

    }
}
