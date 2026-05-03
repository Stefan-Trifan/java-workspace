public class EstadoAceptado implements EstadoPedido
{
    // ------------------------ Métodos Públicos
    @Override
    public void cambiar(Pedido pedido)
    {
        System.out.println("Cambiando estado a ENVIADO");
        pedido.setEstado(new EstadoEnviado());
    }
    @Override
    public double getFactorSegunEstado(Pedido p)
    {
        return p.getFactorAceptado();
    }
    @Override
    public void mostrarEstado()
    {
        System.out.println("ESTADO = ACEPTADO");
    }
}
