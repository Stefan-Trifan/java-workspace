public abstract class ProcesadorTemplate
{
    // _______________________________ Atributos
    // ___________________________ Constructores
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public final void procesar()
    {
        abrir();
        leer();          // Subclase
        procesarDatos(); // Subclase
        cerrar();
    }

    private void abrir()
    {
        System.out.println("- Padre: Abrir elemento...");
    }

    private void cerrar()
    {
        System.out.println("- Padre: Cerrando elemento...");
    }

    public String toString()
    {
        return "- Padre: Procesador Template";
    }

    protected abstract void leer();

    protected abstract void procesarDatos();

    // ________________________ Métodos Privados
}
