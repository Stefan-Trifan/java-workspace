public class PedidoInternacionalFactory extends PedidoFactory
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public Pedido crearPedido()
    {
        Pedido pedido = new PedidoInternacional();
        pedido.setEstado(new EstadoCreado());
        return pedido;
    }
    // ------------------------ Métodos Privados
}
