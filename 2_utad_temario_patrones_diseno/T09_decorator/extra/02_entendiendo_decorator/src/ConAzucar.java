public class ConAzucar extends CafeDecorator
{
    // --------------------------- Constructores
    public ConAzucar(Bebida bebida)
    {
        super(bebida);
    }

    // ------------------------ Métodos Públicos
    @Override
    public String getDescripcion()
    {
        return super.getDescripcion() + " + Azucar";
    }

    @Override
    public double getPrecio()
    {
        return super.getPrecio() + 0.10;
    }
}