public class ConLeche extends CafeDecorator
{
    // --------------------------- Constructores
    public ConLeche(Bebida bebida)
    {
        super(bebida);
    }
    // ------------------------ Métodos Públicos
    @Override
    public String getDescripcion()
    {
        return super.getDescripcion() + " + Leche";
    }
    @Override
    public double getPrecio()
    {
        return super.getPrecio() + 0.30;
    }
}