package v2;
public class Context
{
    // ------------------------------- Atributos
    Strategy myStrategy;

    // --------------------------- Constructores
    public Context(Strategy myStrategy)
    {
        this.myStrategy = myStrategy;
    }

    // --------------------------------- Setters
    public void setStrategy(Strategy myStrategy)
    {
        this.myStrategy = myStrategy;
    }

    // ------------------------ Métodos Públicos
    public void atender()
    {
        myStrategy.atender();
    }

    // ------------------------ Métodos Privados

}
