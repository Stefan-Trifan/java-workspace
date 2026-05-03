public interface EstadoPedido
{
    public void cambiar(Pedido pedido);
    public double getFactorSegunEstado(Pedido p);
    public void mostrarEstado();
}
