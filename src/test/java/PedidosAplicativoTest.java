import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidosAplicativoTest {

    @Test
    void CriarPedidosAplicativo() {
        Servico servico = Pedidos.obterPedido("Aplicativo");
        assertEquals("Pedido Aplicativo Aceito", servico.aceitar());
    }

    @Test
    void CancelarPedidosAplicativo() {
        Servico servico = Pedidos.obterPedido("Aplicativo");
        assertEquals("Pedido cancelado", servico.cancelar());
    }
}