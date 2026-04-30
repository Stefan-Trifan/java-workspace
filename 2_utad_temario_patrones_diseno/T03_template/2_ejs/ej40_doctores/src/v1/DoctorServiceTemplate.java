package v1;
public abstract class DoctorServiceTemplate
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public void atender()
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
