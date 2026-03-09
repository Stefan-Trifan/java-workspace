// Clase abstracta (Template)

// Define el algoritmo completo → procesar()
// Fija el orden de ejecución
// Deja un paso abstracto para que lo implementen las subclases

// Clave:
// El método procesar() NO debe cambiar.
// Por eso suele ser final.

public abstract class ProcesadorArchivo
{
    // ___________________________ Constructores
    // TEMPLATE METHOD
    public final void procesar()
    {
        abrirArchivo();
        procesarContenido(); // paso variable
        cerrarArchivo();
    }

    // ________________________ Métodos Privados
    private void abrirArchivo()
    {
        System.out.println("Abriendo elemento...");
    }

    // PASO ABSTRACTO
    protected abstract void procesarContenido();

    private void cerrarArchivo()
    {
        System.out.println("Cerrando elemento...");
    }
}
