public class ProcesadorTemplate
{
    // ------------------------------- Atributos
    private LeerStrategy     estrategiaLeer;
    private ProcesarStrategy estrategiaProcesar;

    // --------------------------- Constructores
    public ProcesadorTemplate(
        LeerStrategy estrategiaLeer,
        ProcesarStrategy estrategiaProcesar)
    {
        this.estrategiaLeer = estrategiaLeer;
        this.estrategiaProcesar = estrategiaProcesar;
    }

    // --------------------------------- Setters
    public void setEstrategiaLeer(LeerStrategy estrategiaLeer)
    {
        this.estrategiaLeer = estrategiaLeer;
    }

    public void setEstrategiaProcesar(ProcesarStrategy estrategiaProcesar)
    {
        this.estrategiaProcesar = estrategiaProcesar;
    }

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

    public void leer()
    {
        estrategiaLeer.leerDatos();
    }

    public void procesarDatos()
    {
        estrategiaProcesar.procesarDatos();
    }

    private void cerrar()
    {
        System.out.println("- Cerrando elemento...");
    }

    public String toString()
    {
        return "- Procesador Template";
    }

}

// Template
