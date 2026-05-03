public class PedidoInternacional extends Pedido
{
    // ------------------------ Métodos Públicos
    @Override
    public String toString()
    {
        return "Pedido Internacional";
    }
    @Override
    public double getFactorAceptado()
    {
        return 0.1;
    }
    @Override
    public double getFactorEnviado()
    {
        return 0.1;
    }
}
