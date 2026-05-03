public class PedidoNormalFactory extends PedidoFactory
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public Pedido crearPedido()
    {
        Pedido pedido = new PedidoNormal();
        pedido.setEstado(new EstadoCreado());
        return pedido;
    }
    // ------------------------ Métodos Privados
}
