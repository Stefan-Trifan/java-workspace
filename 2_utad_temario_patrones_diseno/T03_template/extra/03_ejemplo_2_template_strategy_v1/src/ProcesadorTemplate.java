

public abstract class ProcesadorTemplate
{
    // _______________________________ Atributos
    private ProcesadoStrategy estrategia;

    // ___________________________ Constructores
    public ProcesadorTemplate(ProcesadoStrategy estrategia)
    {
        this.estrategia = estrategia;
    }

    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
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



    // ________________________ Métodos Privados
}

// Template
