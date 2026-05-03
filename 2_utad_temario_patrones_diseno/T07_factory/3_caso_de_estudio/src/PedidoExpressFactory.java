public class PedidoExpressFactory extends PedidoFactory
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public Pedido crearPedido()
    {
        Pedido pedido = new PedidoExpress();
        pedido.setEstado(new EstadoCreado());
        return pedido;
    }
    // ------------------------ Métodos Privados
}
