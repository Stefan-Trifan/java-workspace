public abstract class PedidoFactory
{
    // ------------------------ Métodos Públicos
    public abstract Pedido crearPedido();

    public void inicializarEstado(Pedido p)
    {
        p.setEstado(new EstadoCreado());
    }
}
