public class Context
{
    // ------------------------------- Atributos
    Strategy mStrategy;
    // --------------------------- Constructores
    public Context(Strategy mStrategy)
    {
        this.mStrategy = mStrategy;
    }
    // --------------------------------- Getters
    // --------------------------------- Setters
    public void setmStrategy(Strategy mStrategy)
    {
        this.mStrategy = mStrategy;
    }
    // ------------------------ Métodos Públicos
    public void examinar()
    {
        mStrategy.examinar();
    }
    public void enviarFactura()
    {
        mStrategy.enviarFactura();
    }
    public void enviarResultado()
    {
        mStrategy.enviarResultado();
    }
    // ------------------------ Métodos Privados

}
