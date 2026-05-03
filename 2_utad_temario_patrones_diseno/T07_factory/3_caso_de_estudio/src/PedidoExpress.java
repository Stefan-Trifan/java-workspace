public class PedidoExpress extends Pedido
{
    // ------------------------ Métodos Públicos
    @Override
    public String toString()
    {
        return "Pedido Express";
    }
    @Override
    public double getFactorAceptado()
    {
        return 0.2;
    }
    @Override
    public double getFactorEnviado()
    {
        return 0.4;
    }
}
