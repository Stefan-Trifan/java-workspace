

public abstract class ProcesadorTemplate
{
    // ------------------------------- Atributos
    private ProcesadoStrategy estrategia;

    // --------------------------- Constructores
    public ProcesadorTemplate(ProcesadoStrategy estrategia)
    {
        this.estrategia = estrategia;
    }

    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public final void procesar()
    {
        abrir();
        leer(); // Subclase. depende del tipo de archivo
        procesarDatos(); // Subclase. delegará en Strategy
        cerrar();
    }

    private void abrir()
    {
        System.out.println("- Abrir elemento...");
    }

    protected abstract void leer();

    public void procesarDatos()
    {
        estrategia.procesarDatos();
    }

    private void cerrar()
    {
        System.out.println("- Cerrando elemento...");
    }

    public String toString()
    {
        return "- Procesador Template";
    }



    // ------------------------ Métodos Privados
}

// Template
