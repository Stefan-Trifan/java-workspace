public class Context
{
    // _______________________________ Atributos
    Strategy mStrategy;
    // ___________________________ Constructores
    public Context(Strategy mStrategy)
    {
        this.mStrategy = mStrategy;
    }
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public double getArea()
    {
        return mStrategy.getArea();
    }
    public String toString()
    {
        return mStrategy.toString();
    }
    // ________________________ Métodos Privados

}
