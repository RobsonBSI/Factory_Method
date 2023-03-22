import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PedidosTelefoneTest {
    @Test
    void CriarPedidosTelefone() {
        Servico servico = Pedidos.obterPedido("Telefone");
        assertEquals("Pedido Telefone Aceito", servico.aceitar());
    }

    @Test
    void CancelarPedidosAplicativo() {
        Servico servico = Pedidos.obterPedido("Telefone");
        assertEquals("Pedido cancelado", servico.cancelar());
    }
}