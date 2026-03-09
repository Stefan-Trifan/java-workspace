public class ContextAreaStrategy
{
    // _______________________________ Atributos
    Strategy mStrategy;
    // ___________________________ Constructores
    public ContextAreaStrategy(Strategy mStrategy)
    {
        this.mStrategy = mStrategy;
    }
    // ________________________ Métodos Públicos
    public double getArea()
    {
        return mStrategy.getArea();
    }
    public String toString()
    {
        return mStrategy.toString();
    }
}
