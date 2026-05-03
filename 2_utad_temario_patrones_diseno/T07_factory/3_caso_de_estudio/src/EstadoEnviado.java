public class EstadoEnviado implements EstadoPedido
{
    // ------------------------ Métodos Públicos
    @Override
    public void cambiar(Pedido pedido)
    {
        System.out.println("Cambiando estado a ENTREGADO");
        pedido.setEstado(new EstadoEntregado());
    }
    @Override
    public double getFactorSegunEstado(Pedido p)
    {
        return p.getFactorEnviado();
    }
    @Override
    public void mostrarEstado()
    {
        System.out.println("ESTADO = ENVIADO");
    }
}
