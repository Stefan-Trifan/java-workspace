public class Cafe implements Bebida
{

    @Override
    public String getDescripcion()
    {
        return "Cafe";
    }

    @Override
    public double getPrecio()
    {
        return 1.50;
    }
}