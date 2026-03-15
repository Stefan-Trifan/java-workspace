package v2;
public class Context
{
    // _______________________________ Atributos
    Strategy myStrategy;

    // ___________________________ Constructores
    public Context(Strategy myStrategy)
    {
        this.myStrategy = myStrategy;
    }

    // _________________________________ Setters
    public void setStrategy(Strategy myStrategy)
    {
        this.myStrategy = myStrategy;
    }

    // ________________________ Métodos Públicos
    public void atender()
    {
        myStrategy.atender();
    }

    // ________________________ Métodos Privados

}
