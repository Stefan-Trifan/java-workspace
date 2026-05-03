public class PedidoExpressFactory extends PedidoFactory
{
    // ------------------------ Métodos Públicos
    @Override
    public Pedido crearPedido()
    {
        Pedido p = new PedidoExpress();
        inicializarEstado(p);
        p.setDiasEntregaBase(2);
        return p;
    }
}
