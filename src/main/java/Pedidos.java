public class Pedidos {
    public static Servico obterPedido(String pedido) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Pedidos" + pedido);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof Servico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (Servico) objeto;
    }
}
