package SenaiMI78.service;

public class ConfirmacaoEmailService {
    public void enviarConfirmacaoPorEmail(String email, String idPedido) {

// Esta classe mudará se trocarmos o serviço de e-mail (ex: de SendGrid para Mailgun).

        System.out.println("Email de confirmação enviado para: " + email + " | Pedido: " +
                idPedido);

// ... (código de integração de API de e-mail)
    }
}
