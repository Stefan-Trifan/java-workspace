public class PedidoNormalFactory extends PedidoFactory
{
    // ------------------------ Métodos Públicos
    @Override
    public Pedido crearPedido()
    {
        Pedido p = new PedidoNormal();
        inicializarEstado(p);
        p.setDiasEntregaBase(5);
        return p;
    }
}
