public abstract class CafeDecorator implements Bebida
{
    // ------------------------------- Atributos
    protected Bebida bebida;

    // --------------------------- Constructores
    public CafeDecorator(Bebida bebida)
    {
        this.bebida = bebida;
    }

    // ------------------------ Métodos Públicos
    public String getDescripcion()
    {
        return bebida.getDescripcion();
    }

    public double getPrecio()
    {
        return bebida.getPrecio();
    }
}
