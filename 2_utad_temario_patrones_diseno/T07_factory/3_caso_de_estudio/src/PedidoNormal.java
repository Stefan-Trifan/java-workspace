public class PedidoNormal extends Pedido
{
    // ------------------------ Métodos Públicos
    @Override
    public String toString()
    {
        return "Pedido Normal";
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
