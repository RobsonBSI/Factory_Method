public class PedidosAplicativo implements Servico{
    @Override
    public String aceitar() {
        return "Pedido Aplicativo Aceito";
    }

    @Override
    public String cancelar() {
        return "Pedido cancelado";
    }
}
