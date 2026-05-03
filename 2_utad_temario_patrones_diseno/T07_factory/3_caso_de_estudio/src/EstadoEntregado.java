public class EstadoEntregado implements EstadoPedido
{
    // ------------------------ Métodos Públicos
    @Override
    public void cambiar(Pedido pedido)
    {
        System.out.println("Operacion no permitida");
    }
    @Override
    public double getFactorSegunEstado(Pedido p)
    {
        return p.getFactorEntregado();
    }
    @Override
    public void mostrarEstado()
    {
        System.out.println("ESTADO = RECIBIDO");
    }
}
