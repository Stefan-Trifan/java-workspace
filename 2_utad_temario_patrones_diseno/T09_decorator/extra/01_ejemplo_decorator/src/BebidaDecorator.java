public abstract class BebidaDecorator implements Bebida
{
    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida)
    {
        this.bebida = bebida;
    }

    public String getDescripcion()
    {
        return bebida.getDescripcion();
    }

    public double getPrecio()
    {
        return bebida.getPrecio();
    }
}

// Decorador Abstracto