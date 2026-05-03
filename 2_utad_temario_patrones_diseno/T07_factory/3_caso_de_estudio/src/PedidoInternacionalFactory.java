public class PedidoInternacionalFactory extends PedidoFactory
{
    // ------------------------ Métodos Públicos
    @Override
    public Pedido crearPedido()
    {
        Pedido p = new PedidoInternacional();
        inicializarEstado(p);
        p.setDiasEntregaBase(10);
        return p;
    }
}
