// Clase abstracta (Template)

// Define el algoritmo completo → procesar()
// Fija el orden de ejecución
// Deja un paso abstracto para que lo implementen las subclases

// Clave:
// El método procesar() NO debe cambiar.
// Por eso suele ser final.

public abstract class ProcesadorArchivo
{
    // TEMPLATE METHOD
    public final void procesar()   
    {
        abrirArchivo();
        procesarContenido(); // paso variable
        cerrarArchivo();
    }

    private void abrirArchivo()
    {
        System.out.println("Abriendo archivo...");
    }
    
    // PASO ABSTRACTO
    protected abstract void procesarContenido();

    private void cerrarArchivo()
    {
        System.out.println("Cerrando archivo...");
    }

}
