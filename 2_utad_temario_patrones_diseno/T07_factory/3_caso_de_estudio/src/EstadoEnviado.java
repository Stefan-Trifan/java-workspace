public class EstadoEnviado implements EstadoPedido
{
    // ------------------------ Métodos Públicos
    public void cambiar(Pedido pedido)
    {
        System.out.println("Cambiando estado a ENTREGADO");
        pedido.setEstado(new EstadoEntregado());
        System.out.println("ESTADO = ENTREGADO");
    }
    public void mostrarEstado()
    {
        System.out.println("ESTADO = ENVIADO");
    }
}
