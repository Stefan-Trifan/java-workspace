public abstract class Pedido
{
    // ------------------------------- Atributos
    private EstadoPedido estado;
    private double diasEntregaBase;
    // --------------------------------- Getters
    public EstadoPedido getEstado()
    {
        return estado;
    }
    public double getDiasEntregaBase()
    {
        return diasEntregaBase;
    }
    // --------------------------------- Setters
    public void setEstado(EstadoPedido estado)
    {
        this.estado = estado;
    }
    public void setDiasEntregaBase(double diasEntregaBase)
    {
        this.diasEntregaBase = diasEntregaBase;
    }
    // ------------------------ Métodos Públicos
    public void cambiar()
    {
        estado.cambiar(this);
    }
    public abstract String toString();

    public double getFactorCreado()
    {
        return 0;
    }
    public abstract double getFactorAceptado();
    public abstract double getFactorEnviado();
    public double getFactorEntregado()
    {
        return 1;
    }
    public double getDiasRestantes()
    {
        return diasEntregaBase - estado.getFactorSegunEstado(this) * diasEntregaBase;
    }
}
