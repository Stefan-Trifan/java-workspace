public class Context
{
    // ------------------------------- Atributos
    Strategy mStrategy;>0
    // --------------------------- Constructores
    public Context(Strategy mStrategy)
    {
        this.mStrategy = mStrategy;
    }
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public double getArea()
    {
        return mStrategy.getArea();
    }
    public String toString()
    {
        return mStrategy.toString();
    }
    // ------------------------ Métodos Privados

}
