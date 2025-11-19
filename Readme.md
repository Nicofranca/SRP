
# SRP - Single Responsibility Principle

---

## Estruturação do Projeto
```
src/main/java/SenaiMI78/
│
├── application/
│   └── App.java                          # Entrada da aplicação
│
├── model/
│   └── Pedido.java                       # Entidade de domínio
│
├── service/
│   ├── ProcessadorDePedido.java          # ORQUESTRADOR - Coordena o fluxo
│   │
│   ├── validador/
│   │   └── ValidacaoQuantidade.java      # RESPONSABILIDADE 1 - Validação
│   │
│   ├── calculadoras/
│   │   ├── CalculadoraFrete.java       # RESPONSABILIDADE "2A" - Cálculo Frete
│   │   └── CalculadoraImpostos.java    # RESPONSABILIDADE "2B" - Cálculo Impostos
│   │
│   └── notificacoes/
│       └── ConfirmacaoEmailService.java           # RESPONSABILIDADE 4 - Notificação
│
└── repository/
    └── PedidoRepository.java             # RESPONSABILIDADE 3 - Persistência
```

---

## Separação

### 1. Manutenibilidade

-  Cada classe tem uma única razão para mudar
-  Mudanças em frete não afetam cálculo de impostos

### 2. Testabilidade

- Você pode testar cada responsabilidade isoladamente
-  Facilita criação de testes unitários
-  Permite uso de mocks

### 3. Reutilização

- `CalculadoraFrete` pode ser usada em outros contextos
- `ValidadorDeEstoque` pode validar outros tipos de pedidos

### 4. Facilita Evolução

-  Adicionar novo tipo de frete? → Mudar `CalculadoraDeFrete`
-  Novo provedor de e-mail? → Mudar `ServicoDeEmail`
-  Nova regra de imposto? → Mudar `CalculadoraDeImpostos`

