public class Azucar extends BebidaDecorator
{
    public Azucar(Bebida bebida)
    {
        super(bebida);
    }

    @Override
    public String getDescripcion()
    {
        return bebida.getDescripcion() + " + Azucar";
    }

    @Override
    public double getPrecio()
    {
        return bebida.getPrecio() + 0.10;
    }
}

// Decoradores Concretos