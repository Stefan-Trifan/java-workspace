public class EstadoCreado implements EstadoPedido
{
    // ------------------------ Métodos Públicos
    @Override
    public void cambiar(Pedido pedido)
    {
        System.out.println("Cambiando estado a ACEPTADO");
        pedido.setEstado(new EstadoAceptado());
    }
    @Override
    public double getFactorSegunEstado(Pedido p)
    {
        return p.getFactorCreado();
    }
    @Override
    public void mostrarEstado()
    {
        System.out.println("ESTADO = CREADO");
    }
}
