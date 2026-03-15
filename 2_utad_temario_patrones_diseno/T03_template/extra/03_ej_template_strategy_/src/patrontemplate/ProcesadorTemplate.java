package patrontemplate;
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
        leer();          // Subclase. depende del tipo de archivo
        procesarDatos(); // Subclase. delegará en Strategy
        cerrar();
    }

    private void abrir()
    {
        System.out.println("- Abrir elemento...");
    }

    private void cerrar()
    {
        System.out.println("- Cerrando elemento...");
    }

    public String toString()
    {
        return "- Procesador Template";
    }

    protected abstract void leer();

    protected abstract void procesarDatos();

    // ________________________ Métodos Privados
}
