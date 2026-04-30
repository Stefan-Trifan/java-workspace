public abstract class ProcesadorTemplate
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
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

    // ------------------------ Métodos Privados
}
