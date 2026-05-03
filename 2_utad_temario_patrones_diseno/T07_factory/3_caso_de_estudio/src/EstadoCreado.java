public class EstadoCreado implements EstadoPedido
{
    // ------------------------ Métodos Públicos
    public void cambiar(Pedido pedido)
    {
        System.out.println("Cambiando estado a ACEPTADO");
        pedido.setEstado(new EstadoAceptado());
        System.out.println("ESTADO = ACEPTADO");
    }
    public void mostrarEstado()
    {
        System.out.println("ESTADO = CREADO");
    }
}
