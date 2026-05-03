public class EstadoEntregado implements EstadoPedido
{
    // ------------------------ Métodos Públicos
    public void cambiar(Pedido pedido)
    {
        System.out.println("Operacion no permitida");
    }
    public void mostrarEstado()
    {
        System.out.println("ESTADO = RECIBIDO");
    }
}
