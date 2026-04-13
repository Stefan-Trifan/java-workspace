public class Leche extends BebidaDecorator
{
    public Leche(Bebida bebida)
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