import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidosIfoodTest {
    @Test
    void CriarPedidosIfood() {
        Servico servico = Pedidos.obterPedido("Ifood");
        assertEquals("Pedido Ifood Aceito", servico.aceitar());
    }

    @Test
    void CancelarPedidosIfood() {
        Servico servico = Pedidos.obterPedido("Ifood");
        assertEquals("Pedido cancelado", servico.cancelar());
    }
}