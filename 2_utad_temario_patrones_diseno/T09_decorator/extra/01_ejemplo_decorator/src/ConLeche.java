public class ConLeche extends BebidaDecorator
{
    public ConLeche(Bebida bebida)
    {
        super(bebida);
    }

    @Override
    public String getDescripcion()
    {
        return bebida.getDescripcion() + " + Leche";
    }

    @Override
    public double getPrecio()
    {
        return bebida.getPrecio() + 0.30;
    }
}

// Decoradores Concretos