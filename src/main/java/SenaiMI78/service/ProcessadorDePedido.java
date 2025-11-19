package SenaiMI78.service;

import SenaiMI78.model.Pedido;
import SenaiMI78.repository.PedidoRepository;
import SenaiMI78.service.validador.ValidacaoQuantidade;

public class ProcessadorDePedido {

        PedidoRepository pedidoRepository = new PedidoRepository();
        ConfirmacaoEmailService confirmacaoEmailService = new ConfirmacaoEmailService();
        ValidacaoQuantidade validacaoQuantidade = new ValidacaoQuantidade();
        CalculoFreteEImposto calculoFreteEImposto = new CalculoFreteEImposto();

        // RESPONSABILIDADE 1 & 2: Validação e Cálculo de Domínio
        public double processar(Pedido pedido) throws Exception {

// 1. Lógica de Validação de Estoque (RESPONSABILIDADE 1)

            validacaoQuantidade.validacaoQuantidade(pedido);

// 2. Lógica de Cálculo de Frete e Impostos (RESPONSABILIDADE 2)

            double valorFinal = calculoFreteEImposto.calcularFrete(pedido);

// Simulação de pagamento e atualização de status

            pedido.setPago(true);

// 3. Lógica de Persistência (RESPONSABILIDADE 3)

            pedidoRepository.salvarNoBancoDeDados(pedido, valorFinal);

// 4. Lógica de Notificação (RESPONSABILIDADE 4)

            confirmacaoEmailService.enviarConfirmacaoPorEmail(pedido.getEmailCliente(), pedido.getId());

            return valorFinal;
        }
    }

