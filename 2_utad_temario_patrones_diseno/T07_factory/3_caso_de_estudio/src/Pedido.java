public abstract class Pedido
{
    // ------------------------------- Atributos
    private EstadoPedido estado;
    // --------------------------- Constructores
    // --------------------------------- Getters
    public EstadoPedido getEstado()
    {
        return estado;
    }
    // --------------------------------- Setters
    public void setEstado(EstadoPedido estado)
    {
        this.estado = estado;
    }
    // ------------------------ Métodos Públicos
    public void cambiar()
    {
        estado.cambiar(this);
    }
    // ------------------------ Métodos Privados

}
