public class EstadoAceptado implements EstadoPedido
{
    // ------------------------ Métodos Públicos
    public void cambiar(Pedido pedido)
    {
        System.out.println("Cambiando estado a ENVIADO");
        pedido.setEstado(new EstadoEnviado());
        System.out.println("ESTADO = ENVIADO");
    }
    public void mostrarEstado()
    {
        System.out.println("ESTADO = ACEPTADO");
    }
}
