public class ProcesadorPDFSimple extends ProcesadorTemplate
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos

    @Override
    protected void leer()
    {
        System.out.println("- Subclase: Leyendo datos PDF");
    }

    @Override
    protected void procesarDatos()
    {
        System.out.println("- Subclase: Procesando datos PDF");
    }
    // ------------------------ Métodos Privados
}
