public class ContextAreaStrategy
{
    // ------------------------------- Atributos
    Strategy mStrategy;
    // --------------------------- Constructores
    public ContextAreaStrategy(Strategy mStrategy)
    {
        this.mStrategy = mStrategy;
    }
    // ------------------------ Métodos Públicos
    public double getArea()
    {
        return mStrategy.getArea();
    }
    public String toString()
    {
        return mStrategy.toString();
    }
}
