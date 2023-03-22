public class PedidosTelefone implements Servico{
    @Override
    public String aceitar() {
        return "Pedido Telefone Aceito";
    }

    @Override
    public String cancelar() {
        return "Pedido cancelado";
    }
}
