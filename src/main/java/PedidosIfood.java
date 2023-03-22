public class PedidosIfood implements Servico{
    @Override
    public String aceitar() {
        return "Pedido Ifood Aceito";
    }

    @Override
    public String cancelar() {
        return "Pedido cancelado";
    }
}
