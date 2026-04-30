package v2;
public abstract class DoctorServiceTemplate implements Strategy
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public final void atender()
    {
        imprimirDia();
        examinar();
        enviarFactura();
        enviarResultado();
    }

    protected abstract void imprimirDia();

    protected abstract void examinar();

    protected abstract void enviarFactura();

    protected abstract void enviarResultado();

    // ------------------------ Métodos Privados
}
