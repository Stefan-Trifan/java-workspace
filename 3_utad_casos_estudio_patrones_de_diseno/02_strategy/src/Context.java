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
    public void setmStrategy(Strategy mStrategy)
    {
        this.mStrategy = mStrategy;
    }
    // ________________________ Métodos Públicos
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
    // ________________________ Métodos Privados

}
